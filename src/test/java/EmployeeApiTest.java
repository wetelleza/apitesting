import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeApiTest {
    private static ExtentReports extent;
    private static ExtentTest test;

    @BeforeAll
    public static void setup() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/SparkReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        test = extent.createTest("Employee API Test", "Validar la creación de un nuevo empleado");
    }

    @Test
    public void testCrearEmpleado() {
        test.info("Iniciando el test para crear un nuevo empleado");

        RestAssured.baseURI = "https://reqres.in/api";

        String requestBody = "{\n" +
                "    \"name\": \"John Doe\",\n" +
                "    \"job\": \"Developer\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post("/users");

        int statusCode = response.getStatusCode();
        assertEquals(201, statusCode);
        test.info("Código de estado: " + statusCode);

        int id = response.jsonPath().getInt("id");
        String name = response.jsonPath().getString("name");
        String job = response.jsonPath().getString("job");

        assertTrue(id > 0);
        assertEquals("John Doe", name);
        assertEquals("Developer", job);

        test.pass("El empleado se creó correctamente con ID: " + id);
    }

    @AfterAll
    public static void tearDown() {
        extent.flush();
    }
}
