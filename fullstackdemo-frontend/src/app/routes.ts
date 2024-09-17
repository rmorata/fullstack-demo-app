import { Routes } from '@angular/router';
import { BoekComponent } from './boek-component/boek-component.component';

const routeConfig: Routes = [
  {
    path: '',
    component: BoekComponent,
    title: 'Boeken App',
  },
];

export default routeConfig;
