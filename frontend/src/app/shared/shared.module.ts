import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ButtonComponent } from './components/button.component';

@NgModule({
  imports: [CommonModule, ButtonComponent],
  exports: [CommonModule, ButtonComponent]
})
export class SharedModule {}
