import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-project-box',
  templateUrl: './project-box.component.html',
  styleUrls: ['./project-box.component.scss']
})
export class ProjectBoxComponent implements OnInit {

    @Input()
    project: object;

  constructor() { }

  ngOnInit() {
  }

}
