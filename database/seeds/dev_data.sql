-- Dev initial seeds
INSERT INTO auth.roles (name, description) VALUES
('ROLE_ADMIN', 'Administrador con acceso total'),
('ROLE_USER', 'Usuario estándar')
ON CONFLICT (name) DO NOTHING;

INSERT INTO auth.permissions (name, description) VALUES
('user:read', 'Leer información de usuarios'),
('user:write', 'Crear y actualizar usuarios')
ON CONFLICT (name) DO NOTHING;
