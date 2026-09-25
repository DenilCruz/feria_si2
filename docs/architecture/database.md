# Base de Datos (PostgreSQL)

Se adopta una separación lógica por **Schemas** dentro de una misma base de datos relacional para garantizar aislamiento entre bounded contexts:

- `auth.*`: Tablas relacionadas con credenciales, tokens, roles y permisos.
- `users.*`: Tablas relacionadas con los usuarios del sistema y sus perfiles.

Las migraciones de versiones se gestionan a través de herramientas estándar como Flyway/Liquibase (`V1__...`, `V2__...`).
