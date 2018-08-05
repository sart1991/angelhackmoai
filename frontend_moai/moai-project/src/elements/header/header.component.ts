import { Component, OnInit } from '@angular/core';
import {MatToolbarModule} from '@angular/material/toolbar';
import { NavService } from '../../services/nav.service';
import { NavigationArray } from '../../interfaces/navigation-array';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  navLinks$: NavigationArray;

  constructor(public navService: NavService) { }

  ngOnInit() {

      this.navLinks$ = this.navService.navigationLinks;

  }

}
