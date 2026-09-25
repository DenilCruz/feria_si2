import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-sidebar',
  standalone: true,
  imports: [CommonModule, RouterModule],
  template: `
    <nav class="sidebar">
      <ul>
        <li><a routerLink="/users">Usuarios</a></li>
      </ul>
    </nav>
  `
})
export class SidebarComponent {}
