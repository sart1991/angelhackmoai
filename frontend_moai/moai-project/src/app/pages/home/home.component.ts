import { Component, OnInit } from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {StarredProjectService} from '../../services/starred-projects/starred-project.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  starredProjectList: Array<object>;
  constructor(private starredProjectService: StarredProjectService) { }
  ngOnInit() {
    this.starredProjectList = this.starredProjectService.starredProjectList;
  }

}
