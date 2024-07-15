import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowApprovalTableComponent } from './show-approval-table.component';

describe('ShowApprovalTableComponent', () => {
  let component: ShowApprovalTableComponent;
  let fixture: ComponentFixture<ShowApprovalTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowApprovalTableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowApprovalTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
