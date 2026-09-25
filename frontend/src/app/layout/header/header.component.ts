import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [CommonModule],
  template: `<header class="app-header"><h1>App Monorepo</h1></header>`,
  styles: [`.app-header { background: #1e293b; color: white; padding: 1rem; }`]
})
export class HeaderComponent {}
