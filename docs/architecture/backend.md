# Arquitectura de Backend (Spring Boot)

El backend sigue los principios de la **Arquitectura Hexagonal (Ports & Adapters)** y diseño modular.

## Módulos

1. **shared**: Contiene abstracciones reutilizables, DTOs genéricos (`ApiResponse`, `PageResponse`), filtros de seguridad base y excepciones de negocio.
2. **auth-module**: Gestiona autenticación, emisión y validación de tokens JWT, roles y permisos.
3. **user-module**: Administra el dominio de usuarios, perfiles y datos de negocio asociados.
4. **bootstrap**: Aplicación principal de Spring Boot (`@SpringBootApplication`). Ensambla los módulos y carga las propiedades de configuración.

## Capas por Módulo

- **Domain**: Modelos de dominio (`model`), contratos de repositorio (`repository`) y servicios de dominio (`service`). Sin dependencias a frameworks externos.
- **Application**: Casos de uso (`usecase`), DTOs de entrada/salida (`dto`) y mappers (`mapper`).
- **Infrastructure**: Implementaciones de persistencia JPA (`persistence`), seguridad (`security`) y configuraciones de Spring (`config`).
- **Presentation**: Controladores REST (`controller`) que exponen la API pública.
