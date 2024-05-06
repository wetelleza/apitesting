plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:5.1.1")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.8.0")
    testImplementation ("com.aventstack:extentreports:5.0.9")

}

tasks.test {
    useJUnitPlatform()
}

