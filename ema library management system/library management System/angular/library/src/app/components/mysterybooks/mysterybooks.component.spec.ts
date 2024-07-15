import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MysterybooksComponent } from './mysterybooks.component';

describe('MysterybooksComponent', () => {
  let component: MysterybooksComponent;
  let fixture: ComponentFixture<MysterybooksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MysterybooksComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MysterybooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
