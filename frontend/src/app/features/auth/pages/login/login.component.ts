import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  template: `
    <div class="login-container">
      <h2>Iniciar Sesión</h2>
      <form (ngSubmit)="onLogin()">
        <input type="email" [(ngModel)]="email" name="email" placeholder="Correo" required />
        <input type="password" [(ngModel)]="password" name="password" placeholder="Contraseña" required />
        <button type="submit">Entrar</button>
      </form>
    </div>
  `,
  styles: [`
    .login-container { max-width: 320px; margin: 2rem auto; padding: 1.5rem; border: 1px solid #e2e8f0; border-radius: 8px; }
    input { width: 100%; margin-bottom: 1rem; padding: 0.5rem; box-sizing: border-box; }
    button { width: 100%; padding: 0.5rem; background: #2563eb; color: white; border: none; border-radius: 4px; }
  `]
})
export class LoginComponent {
  email = '';
  password = '';

  constructor(private router: Router) {}

  onLogin() {
    this.router.navigate(['/users']);
  }
}
