import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StarredProjectService {

  starredProjectList: Array<object> = [
      {
          title: 'Alberja en Paipa',
          media: '../../../assets/arvejas.png',
          foundedPercentage: 70,
          daysLeft: 21
      },
      {
          title: 'Alberja en Tunja',
          media: '../../../assets/arveja.png',
          foundedPercentage: 50,
          daysLeft: 33
      }
  ];

  constructor() { }
}
