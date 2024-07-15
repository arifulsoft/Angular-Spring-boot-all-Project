import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RetunbooksComponent } from './retunbooks.component';

describe('RetunbooksComponent', () => {
  let component: RetunbooksComponent;
  let fixture: ComponentFixture<RetunbooksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RetunbooksComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RetunbooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
