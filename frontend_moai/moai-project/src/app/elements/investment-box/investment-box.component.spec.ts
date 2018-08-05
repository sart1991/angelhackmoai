import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InvestmentBoxComponent } from './investment-box.component';

describe('InvestmentBoxComponent', () => {
  let component: InvestmentBoxComponent;
  let fixture: ComponentFixture<InvestmentBoxComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InvestmentBoxComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InvestmentBoxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
