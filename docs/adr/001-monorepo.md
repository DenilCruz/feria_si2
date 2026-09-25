# ADR 001: Adopción de Monorepo Modular

## Estado
Aprobado

## Contexto
El equipo necesita desarrollar una solución completa que comprende backend, frontend web, aplicación móvil, esquemas de bases de datos e infraestructura asociada.

## Decisión
Se adopta una estructura de **Monorepo Modularizado**:
- Backend con Spring Boot multi-módulo (Arquitectura Hexagonal).
- Frontend web con Angular (Arquitectura modular + lazy loading).
- Mobile con Flutter (Clean Architecture + Feature-First).
- Base de datos versionada por esquemas.

## Consecuencias
- **Positivas**: Trazabilidad completa de cambios transversales, integración continua unificada, consistencia de contratos API y fácil orquestación local con Docker Compose.
- **Negativas**: Mayor cuidado requerido en las dependencias entre módulos y herramientas de CI/CD para ejecutar tareas selectivas.
