import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalesByPaymentTypeComponent } from './sales-by-payment-type.component';

describe('SalesByPaymentTypeComponent', () => {
  let component: SalesByPaymentTypeComponent;
  let fixture: ComponentFixture<SalesByPaymentTypeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalesByPaymentTypeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SalesByPaymentTypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
