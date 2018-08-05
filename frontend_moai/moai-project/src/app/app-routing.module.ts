import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './pages/home/home.component';
import {InvestComponent} from './pages/invest/invest.component';
import {PartnerInvestmentListComponent} from './pages/partner-investment-list/partner-investment-list.component';
import {InvestmentDetailComponent} from './pages/investment-detail/investment-detail.component';
import {ProjectDetailComponent} from './pages/project-detail/project-detail.component';

const routes: Routes = [
    {path: '', component: HomeComponent},
    {path: 'invertir', component: InvestComponent},
    {path: 'detalle-de-proyecto', component: ProjectDetailComponent},
    {path: 'mis-inversiones', component: PartnerInvestmentListComponent},
    {path: 'detalle-de-inversion', component: InvestmentDetailComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
