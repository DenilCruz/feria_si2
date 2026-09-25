# Arquitectura de Frontend (Angular)

El frontend está estructurado mediante arquitectura modular moderna con **Lazy Loading** y componentes Standalone.

## Estructura de Directorios

- `core/`: Servicios singleton (`AuthService`, `ApiService`, `TokenService`), guards e interceptores HTTP.
- `shared/`: Componentes UI reutilizables (botones, modales), directivas y pipes puros.
- `features/`: Módulos de dominio de la aplicación (`auth`, `users`). Cada feature encapsula sus propias páginas, rutas hijas, servicios y modelos.
- `layout/`: Componentes de estructura global (Header, Sidebar, MainLayout).
