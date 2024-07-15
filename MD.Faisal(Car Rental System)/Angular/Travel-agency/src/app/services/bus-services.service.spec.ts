import { TestBed } from '@angular/core/testing';

import { BusServicesService } from './bus-services.service';

describe('BusServicesService', () => {
  let service: BusServicesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BusServicesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
