import { Injectable } from '@angular/core';
import {InvestmentData} from '../interfaces/investment-data';

@Injectable({
  providedIn: 'root'
})
export class InvestmentService {

    investmentTypes: Array<InvestmentData>  = [
        {
            id: 0,
            name: 'Tierra',
            media: '../../../assets/tierra.svg'
        },
        {
            id: 1,
            name: 'Dinero',
            media: '../../../assets/mano-de-obra.svg'
        },
        {
            id: 2,
            name: 'Mano de Obra',
            media: '../../../assets/semillas.svg'
        }
        {
            id: 3,
            name: 'Transporte',
            media: '../../../assets/transporte.svg'
        }
    ];

  constructor() { }

  getInvestmentTypeById(id: number): any {
    return this.investmentTypes.filter(item => id === item.id);
  }

}
