import { Component, OnInit, Inject } from '@angular/core';
import {MatDialogRef} from '@angular/material';

@Component({
  selector: 'app-confirmation-modal',
  templateUrl: './confirmation-modal.component.html',
  styleUrls: ['./confirmation-modal.component.scss']
})
export class ConfirmationModalComponent implements OnInit {

    constructor(public dialogRef: MatDialogRef<ConfirmationModalComponent>) {}

    onNoClick(): void {
        this.dialogRef.close();
    }

  ngOnInit() {
  }
}
