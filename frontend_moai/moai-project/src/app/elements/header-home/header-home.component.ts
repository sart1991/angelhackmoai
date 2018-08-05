import { Component, OnInit } from '@angular/core';
import { NavService } from '../../services/nav.service';
import { NavigationArray } from '../../interfaces/navigation-array';

@Component({
  selector: 'app-header-home',
  templateUrl: './header-home.component.html',
  styleUrls: ['./header-home.component.scss']
})
export class HeaderHomeComponent implements OnInit {

    navLinks$: NavigationArray;
    metrics: Array<object>;

    constructor(public navService: NavService) { }

  ngOnInit() {
      this.navLinks$ = this.navService.navigationLinks;
      this.metrics = [
          {
              number: '83%',
              description: 'Campesinos sin acceso a crédito.'
          },
          {
              number: '28%',
              description: 'Productos agrícolas importados.'
          },
          {
              number: '40%',
              description: 'Del área rural se desaprovecha.'
          }
      ];

  }

}
