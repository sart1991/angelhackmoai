import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { InvestmentService } from '../../services/investment.service';
import { InvestmentData } from '../../interfaces/investment-data';
import { MatDialog } from '@angular/material';
import { ConfirmationModalComponent } from '../../elements/confirmation-modal/confirmation-modal.component';



@Component({
  selector: 'app-invest',
  templateUrl: './invest.component.html',
  styleUrls: ['./invest.component.scss']
})
export class InvestComponent implements OnInit {

    investmentTypeFormGroup: FormGroup;
    paymentFormGroup: FormGroup;
    legalInfoFormGroup: FormGroup;

    investmentId: number;
    paymentId: number;
    investmentTypes$: Array<InvestmentData>;
    investmentData: InvestmentData;

    constructor(private _formBuilder: FormBuilder, private investmentService: InvestmentService, public dialog: MatDialog) {}

    openDialog(): void {
        this.dialog.open(ConfirmationModalComponent, {
            width: '20rem'
        });
    }

    ngOnInit() {
        this.investmentTypes$ = this.investmentService.investmentTypes;

        this.investmentTypeFormGroup = new FormGroup({
            investmentTypeCtrl: new FormControl()
        });

        this.paymentFormGroup = new FormGroup({
            paymentCtrl: new FormControl()
        });

        this.legalInfoFormGroup = new FormGroup({
            legalInfoCtrl: new FormControl()
        });

        this.investmentData = this.investmentService.getInvestmentTypeById(this.investmentId);
        //console.log(`selected investmentData: ${this.investmentData}`);


    }

}