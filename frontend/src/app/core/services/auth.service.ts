import { Injectable, signal } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private _isAuthenticated = signal<boolean>(false);

  isAuthenticated(): boolean {
    return this._isAuthenticated();
  }

  hasRole(role: string): boolean {
    return true;
  }

  login(): void {
    this._isAuthenticated.set(true);
  }

  logout(): void {
    this._isAuthenticated.set(false);
  }
}
