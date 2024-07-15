import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DuepaidComponent } from './duepaid.component';

describe('DuepaidComponent', () => {
  let component: DuepaidComponent;
  let fixture: ComponentFixture<DuepaidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DuepaidComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DuepaidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
