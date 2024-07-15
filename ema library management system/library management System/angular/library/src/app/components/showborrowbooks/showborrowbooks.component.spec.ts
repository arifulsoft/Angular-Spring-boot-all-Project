import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowborrowbooksComponent } from './showborrowbooks.component';

describe('ShowborrowbooksComponent', () => {
  let component: ShowborrowbooksComponent;
  let fixture: ComponentFixture<ShowborrowbooksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowborrowbooksComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowborrowbooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
