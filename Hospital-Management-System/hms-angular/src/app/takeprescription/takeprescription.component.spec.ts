import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TakeprescriptionComponent } from './takeprescription.component';

describe('TakeprescriptionComponent', () => {
  let component: TakeprescriptionComponent;
  let fixture: ComponentFixture<TakeprescriptionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TakeprescriptionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TakeprescriptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
