export interface LoginRequest {
  email: string;
  passwordHash: string;
}

export interface TokenResponse {
  accessToken: string;
  refreshToken: string;
}
