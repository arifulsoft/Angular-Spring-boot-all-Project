import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowCarbookingTableComponent } from './show-carbooking-table.component';

describe('ShowCarbookingTableComponent', () => {
  let component: ShowCarbookingTableComponent;
  let fixture: ComponentFixture<ShowCarbookingTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowCarbookingTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowCarbookingTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
