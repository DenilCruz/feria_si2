# Monorepo Modularizado

Proyecto empresarial modularizado con Backend (Spring Boot - Arquitectura Hexagonal), Frontend (Angular - Modular + Lazy Loading), Mobile (Flutter - Feature-First + Clean Architecture), Base de Datos (PostgreSQL con esquemas modulares) e Infraestructura con Docker.

---

## 📁 Estructura del Monorepo

```text
├── .github/workflows/          # Pipelines de CI/CD para Backend, Frontend y Mobile
├── backend/                    # Spring Boot (Multi-módulo Maven + Arquitectura Hexagonal)
│   ├── shared/                 # DTOs comunes, excepciones, utilitarios y seguridad base
│   ├── auth-module/            # Módulo de Autenticación (JWT, roles, permisos)
│   ├── user-module/            # Módulo de Gestión de Usuarios
│   └── bootstrap/              # Punto de entrada de la aplicación Spring Boot
├── frontend/                   # Angular (Standalone / Modular + Lazy Loading)
│   ├── src/app/core/           # Servicios singleton, interceptores y guards
│   ├── src/app/shared/         # Componentes y pipes reutilizables
│   ├── src/app/features/       # Features de negocio (auth, users)
│   └── src/app/layout/         # Estructura visual (header, sidebar, main-layout)
├── mobile/                     # Flutter (Feature-First + Clean Architecture)
│   ├── lib/core/               # Clientes de red, almacenamiento, router, temas
│   ├── lib/features/           # Features independientes (auth, user)
│   └── lib/injection/          # Inyección de dependencias (get_it)
├── database/                   # Migraciones Flyway y seeds para PostgreSQL
├── docs/                       # Documentación técnica, ADRs y especificación OpenAPI
└── infrastructure/             # Dockerfiles, Nginx y configuraciones de despliegue
```

---

## 🚀 Inicio Rápido con Docker

Para levantar todo el ecosistema (PostgreSQL, Backend y Frontend):

```bash
docker compose up -d
```

O utilizando el `Makefile`:

```bash
make up
```

---

## 🛠️ Comandos Disponibles (Makefile)

- `make up`: Inicia los servicios con docker compose.
- `make down`: Detiene los contenedores.
- `make logs`: Muestra los logs en tiempo real.
- `make build`: Reconstruye todas las imágenes de docker.
- `make backend-test`: Ejecuta pruebas unitarias del backend.
- `make frontend-test`: Ejecuta pruebas unitarias del frontend.
- `make mobile-test`: Ejecuta pruebas unitarias de Flutter.
