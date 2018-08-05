import { TestBed, inject } from '@angular/core/testing';

import { StarredProjectService } from './starred-project.service';

describe('StarredProjectService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [StarredProjectService]
    });
  });

  it('should be created', inject([StarredProjectService], (service: StarredProjectService) => {
    expect(service).toBeTruthy();
  }));
});
