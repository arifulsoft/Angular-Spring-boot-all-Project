import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelectedCarsComponent } from './selected-cars.component';

describe('SelectedCarsComponent', () => {
  let component: SelectedCarsComponent;
  let fixture: ComponentFixture<SelectedCarsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelectedCarsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SelectedCarsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
