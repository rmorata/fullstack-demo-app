import { Injectable } from '@angular/core';
import { Boek } from './boek';

@Injectable({
  providedIn: 'root',
})
export class BooksService {
  readonly url = 'http://localhost:8080/getBooks';

  async getAllBooks(): Promise<Boek[]> {
    const data = await fetch(this.url);
    return (await data.json()) ?? [];
  }

  constructor() {}
}
