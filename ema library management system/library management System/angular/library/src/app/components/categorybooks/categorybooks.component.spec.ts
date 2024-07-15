import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategorybooksComponent } from './categorybooks.component';

describe('CategorybooksComponent', () => {
  let component: CategorybooksComponent;
  let fixture: ComponentFixture<CategorybooksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategorybooksComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CategorybooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
