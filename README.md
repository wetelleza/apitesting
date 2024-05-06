# Employee API Testing

Este proyecto tiene como objetivo realizar pruebas de la API para la funcionalidad de creación de empleados utilizando RestAssured con Gradle.

## Descripción

El propósito de este proyecto es verificar que la funcionalidad de creación de empleados a través de la API funcione correctamente según los criterios de aceptación establecidos. La API permite enviar solicitudes POST para crear un nuevo empleado y devolver el ID del empleado creado.

### Funcionalidades Probadas
- **Crear Empleado Válido:** Envía una solicitud POST con datos válidos para un nuevo empleado y valida la respuesta.
- **Verificar Código de Estado 201:** Asegura que el código de estado HTTP devuelto sea `201` (Creado).
- **Validación del ID:** Confirma que el ID devuelto es un número entero positivo.
- **Verificación de Datos Coincidentes:** Comprueba que el `name` y `job` en la respuesta coincidan con los enviados en la solicitud.

## Configuración

Para ejecutar el proyecto, asegúrate de tener lo siguiente:

1. **Java Development Kit (JDK):** Versión 8 o superior.
2. **Gradle:** Instalado en tu sistema.

### Instalación

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/employee-api-testing.git
