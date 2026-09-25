import 'package:go_router/go_router.dart';
import '../../features/auth/presentation/pages/login_page.dart';
import '../../features/user/presentation/pages/user_list_page.dart';

final appRouter = GoRouter(
  initialLocation: '/login',
  routes: [
    GoRoute(
      path: '/login',
      builder: (_, __) => const LoginPage(),
    ),
    GoRoute(
      path: '/users',
      builder: (_, __) => const UserListPage(),
    ),
  ],
  redirect: (context, state) {
    // Lógica de validación de autenticación
    return null;
  },
);
