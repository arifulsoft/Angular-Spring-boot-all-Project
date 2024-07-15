import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewbookinsertComponent } from './newbookinsert.component';

describe('NewbookinsertComponent', () => {
  let component: NewbookinsertComponent;
  let fixture: ComponentFixture<NewbookinsertComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewbookinsertComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewbookinsertComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
