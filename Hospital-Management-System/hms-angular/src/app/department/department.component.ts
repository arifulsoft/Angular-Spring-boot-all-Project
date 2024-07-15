import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Department } from '../models/department';
import { Appointment } from '../models/appointment';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  p_id: any;
  p_name: any;
  dep_name: any;
  doc_name: any;
  c_fee: any;
  date: any;
  time: any;

  postalldata: any;


  allData: any = [];
  //--------------------show department data--------------
  constructor(private myservice: HmsService) {
    this.myservice.showalldept().subscribe((x) => {
      this.allData = x;
    });
  }


  // -------------insert department data---------------
  dep() {
    this.postalldata = new Appointment(this.p_id, this.p_name, this.dep_name, this.doc_name, this.c_fee, this.date, this.time);
    this.myservice.saveDep(this.postalldata).subscribe(() => {
      alert("Dear Sir,your appointment is confirmed");
    });
  }

  ngOnInit() {
  }

  departmentId: any;
  data: any = [];
  changeDep(p: any) {
    this.departmentId = this.allData[p].dep_id;
    this.myservice.getdocname(this.departmentId).subscribe((x) => {
      this.data = x;
    });
  }


}