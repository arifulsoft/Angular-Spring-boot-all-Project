import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patient-profile',
  templateUrl: './patient-profile.component.html',
  styleUrls: ['./patient-profile.component.css']
})
export class PatientProfileComponent implements OnInit {

p_id:any
 name:any
 dob:any
 gender:any
 bg:any
 email:any
 address:any
 mobile:any

  constructor(){ }

  ngOnInit() {
  }
profile(){

}
}
