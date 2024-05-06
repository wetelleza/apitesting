# Pruebas de API de Empleados

Este proyecto contiene un conjunto de pruebas que valida las funcionalidades de la API de empleados (`https://reqres.in/api`). Se utilizan diferentes casos de prueba para comprobar los comportamientos bajo diferentes escenarios, incluyendo la creación de empleados, pruebas negativas, carga y validación de campos generados automáticamente.

## Descripción

### Casos de Prueba:

1. **EmployeeApiTest:**
   - **Descripción:** Probar la creación de un nuevo empleado con los campos `name` y `job`.
   - **Criterios de Aceptación:**
      - El código de estado debe ser 201 (Creado).
      - El ID del empleado debe ser positivo y se debe devolver el nombre y trabajo proporcionados.
   - **Ejemplo:** Verifica que el ID generado es válido y coincide con los datos de entrada.

2. **EmployeeApiNegativeTest:**
   - **Descripción:** Probar la creación de un empleado cuando falta el campo `job`.
   - **Criterios de Aceptación:**
      - El código de estado debe ser 201.
      - El campo `job` debería ser nulo o estar ausente en la respuesta.
   - **Ejemplo:** Verifica que el campo `job` no está presente y que el campo `id` es positivo.

3. **EmployeeApiLoadTest:**
   - **Descripción:** Probar cómo responde la API bajo una carga de 100 solicitudes para la creación de empleados.
   - **Criterios de Aceptación:**
      - El código de estado para todas las solicitudes debe ser 201.
      - Cada solicitud debe devolver un ID único y una fecha de creación (`createdAt`).
   - **Ejemplo:** Valida que todas las solicitudes se procesan con éxito bajo carga.

4. **EmployeeApiCreatedAtTest:**
   - **Descripción:** Probar que el campo `createdAt` se genera automáticamente y no se puede modificar.
   - **Criterios de Aceptación:**
      - El campo `createdAt` generado no debe coincidir con el valor proporcionado en el cuerpo de solicitud.
   - **Ejemplo:** Valida que `createdAt` es diferente al valor proporcionado y tiene un formato válido.

## Tecnologías Usadas

- **Java:** Lenguaje principal de desarrollo.
- **JUnit 5:** Framework de pruebas.
- **RestAssured:** Para realizar pruebas de la API.
- **ExtentReports:** Para generar informes detallados.

## Configuración y Ejecución

1. **Clonar el Proyecto:**
   - Clona este repositorio con:
   ```bash
   git clone https://github.com/tu-usuario/employee-api-testing.git
