import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-list',
  standalone: true,
  imports: [CommonModule],
  template: `
    <div>
      <h2>Lista de Usuarios</h2>
      <p>Módulo de gestión de usuarios.</p>
    </div>
  `
})
export class UserListComponent {}
