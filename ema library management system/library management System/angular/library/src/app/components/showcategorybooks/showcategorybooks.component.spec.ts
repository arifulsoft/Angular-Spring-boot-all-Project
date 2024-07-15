import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowcategorybooksComponent } from './showcategorybooks.component';

describe('ShowcategorybooksComponent', () => {
  let component: ShowcategorybooksComponent;
  let fixture: ComponentFixture<ShowcategorybooksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowcategorybooksComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowcategorybooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
