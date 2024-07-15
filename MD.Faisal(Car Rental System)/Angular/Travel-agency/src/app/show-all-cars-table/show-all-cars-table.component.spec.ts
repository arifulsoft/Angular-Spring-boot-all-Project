import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowAllCarsTableComponent } from './show-all-cars-table.component';

describe('ShowAllCarsTableComponent', () => {
  let component: ShowAllCarsTableComponent;
  let fixture: ComponentFixture<ShowAllCarsTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowAllCarsTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowAllCarsTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
