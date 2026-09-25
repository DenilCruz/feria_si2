# Arquitectura de Mobile (Flutter)

El proyecto móvil utiliza **Feature-First + Clean Architecture** junto con BLoC para la gestión reactiva de estado y GoRouter para navegación declarativa.

## Capas de una Feature

- **Data**: Fuentes de datos remotas y locales (`datasources`), modelos con serialización JSON (`models`) e implementaciones de repositorio (`repositories`).
- **Domain**: Entidades puras de Dart (`entities`), interfaces de repositorio (`repositories`) y casos de uso (`usecases`).
- **Presentation**: Gestión de estado (`bloc`), pantallas (`pages`) y widgets específicos (`widgets`).
