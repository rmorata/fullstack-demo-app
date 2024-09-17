import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterOutlet } from '@angular/router';
import { Boek } from '../boek';

@Component({
  selector: 'app-boek-component',
  standalone: true,
  imports: [CommonModule, RouterLink, RouterOutlet],
  template: `
    <section class="boek">
      <p>{{ boek.titel }}</p>
      <p class="info">Geschreven door: {{ boek.auteur }}</p>
      <img src="{{ boek.afbeeldingURL }}" />
      <p class="info">Dit boek bevat {{ boek.aantalExemplaren }} exemplaren.</p>
    </section>
  `,
  styleUrl: './boek-component.component.css',
})
export class BoekComponent {
  @Input() boek!: Boek;
}
