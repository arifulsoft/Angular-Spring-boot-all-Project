import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FinallistComponent } from './finallist.component';

describe('FinallistComponent', () => {
  let component: FinallistComponent;
  let fixture: ComponentFixture<FinallistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FinallistComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FinallistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
