import { Injectable } from '@angular/core';
import { NavigationArray } from '../interfaces/navigation-array';

@Injectable({
  providedIn: 'root'
})
export class NavService {

  navigationLinks: NavigationArray = [
      {
        title: 'Quiénes somos',
        link: '/'
      },
      {
        title: 'Proyectos',
        link: '/'
      },
      {
        title: 'Cómo invertir',
        link: '/'
      },
      {
        title: 'Contacto',
        link: '/'
      }
  ];

  constructor() { }
}
