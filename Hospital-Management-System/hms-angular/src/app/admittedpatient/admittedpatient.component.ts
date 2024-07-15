import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admittedpatient',
  templateUrl: './admittedpatient.component.html',
  styleUrls: ['./admittedpatient.component.css']
})
export class AdmittedpatientComponent implements OnInit {

  d_id: any;

  allpatient: any;

  constructor(private myservice: HmsService, private router: Router) { }

  ngOnInit() {
  }

  searchPatient() {
    this.myservice.getalladmissionpatient(this.d_id).subscribe((x) => {
      this.allpatient = x;
      
    });

  }

}