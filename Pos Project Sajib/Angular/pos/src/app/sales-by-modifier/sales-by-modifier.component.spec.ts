import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalesByModifierComponent } from './sales-by-modifier.component';

describe('SalesByModifierComponent', () => {
  let component: SalesByModifierComponent;
  let fixture: ComponentFixture<SalesByModifierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalesByModifierComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SalesByModifierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
