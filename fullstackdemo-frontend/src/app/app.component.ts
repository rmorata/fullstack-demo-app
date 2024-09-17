import { Component, inject } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { Boek } from './boek';
import { BoekComponent } from './boek-component/boek-component.component';
import { BooksService } from './books.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, BoekComponent, RouterModule],
  template: `<section class="books">
    <app-boek-component
      *ngFor="let boek of boekList"
      [boek]="boek"
    ></app-boek-component>
  </section>`,
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'fullstackdemo-frontend';

  boekList: Boek[] = [];
  booksService: BooksService = inject(BooksService);

  constructor() {
    this.booksService.getAllBooks().then((boekList: Boek[]) => {
      this.boekList = boekList;
    });
  }
}
