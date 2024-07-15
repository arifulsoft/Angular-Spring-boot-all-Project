import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowalluserdataComponent } from './showalluserdata.component';

describe('ShowalluserdataComponent', () => {
  let component: ShowalluserdataComponent;
  let fixture: ComponentFixture<ShowalluserdataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowalluserdataComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowalluserdataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
