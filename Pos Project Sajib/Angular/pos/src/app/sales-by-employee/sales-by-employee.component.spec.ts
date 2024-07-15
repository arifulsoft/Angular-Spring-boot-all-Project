import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalesByEmployeeComponent } from './sales-by-employee.component';

describe('SalesByEmployeeComponent', () => {
  let component: SalesByEmployeeComponent;
  let fixture: ComponentFixture<SalesByEmployeeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalesByEmployeeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SalesByEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
