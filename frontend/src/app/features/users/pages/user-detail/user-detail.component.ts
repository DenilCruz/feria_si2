import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-detail',
  standalone: true,
  imports: [CommonModule],
  template: `<div><h2>Detalle de Usuario</h2></div>`
})
export class UserDetailComponent {}
