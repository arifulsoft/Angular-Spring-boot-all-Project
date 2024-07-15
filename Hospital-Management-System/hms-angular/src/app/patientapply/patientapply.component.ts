import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Patientapply } from '../models/patientapply';

@Component({
  selector: 'app-patientapply',
  templateUrl: './patientapply.component.html',
  styleUrls: ['./patientapply.component.css']
})
export class PatientapplyComponent implements OnInit {

  nid: any;
  name: any;
  age: any;
  address: any;
  phone: any;
  problem: any;

  data: any;
  constructor(private myservice: HmsService) { }

  ngOnInit() {
  }

  apply() {
    this.data = new Patientapply(this.nid, this.name, this.age, this.address, this.phone, this.problem);
    this.myservice.applyforadmit(this.data).subscribe(()=>{
      alert("Dear sir,your admission is under consideration");
    })
  }
}