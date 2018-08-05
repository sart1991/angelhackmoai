import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { InvestComponent } from './pages/invest/invest.component';
import { ProjectDetailComponent } from './pages/project-detail/project-detail.component';
import { HeaderComponent } from './elements/header/header.component';
import { FooterComponent } from './elements/footer/footer.component';
import { MaterialModule } from './modules/material/material.module';
import { ProjectBoxComponent } from './elements/project-box/project-box.component';
import { InvestmentBoxComponent } from './elements/investment-box/investment-box.component';
import { InvestmentDetailComponent } from './pages/investment-detail/investment-detail.component';
import { PartnerInvestmentListComponent } from './pages/partner-investment-list/partner-investment-list.component';
import { ConfirmationModalComponent } from './elements/confirmation-modal/confirmation-modal.component';
import { LogoComponent } from './elements/logo/logo.component';
import { HeaderHomeComponent } from './elements/header-home/header-home.component';
import { NavigationComponent } from './elements/navigation/navigation.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    InvestComponent,
    ProjectDetailComponent,
    HeaderComponent,
    FooterComponent,
    ProjectBoxComponent,
    InvestmentBoxComponent,
    InvestmentDetailComponent,
    PartnerInvestmentListComponent,
    ConfirmationModalComponent,
    LogoComponent,
    HeaderHomeComponent,
    NavigationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule
  ],
    entryComponents: [
        ConfirmationModalComponent,
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
