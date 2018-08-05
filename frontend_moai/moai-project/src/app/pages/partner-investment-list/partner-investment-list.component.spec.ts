import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PartnerInvestmentListComponent } from './partner-investment-list.component';

describe('PartnerInvestmentListComponent', () => {
  let component: PartnerInvestmentListComponent;
  let fixture: ComponentFixture<PartnerInvestmentListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PartnerInvestmentListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PartnerInvestmentListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
