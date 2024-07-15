import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patient-details',
  templateUrl: './patient-details.component.html',
  styleUrls: ['./patient-details.component.css']
})
export class PatientDetailsComponent implements OnInit {
  p_id: any
  name: any
  dob: any
  gender: any
  b_group: any
  email: any
  address: any
  mobile: any
  constructor() { }

  ngOnInit() {
  }
patient(){
  
}
}
