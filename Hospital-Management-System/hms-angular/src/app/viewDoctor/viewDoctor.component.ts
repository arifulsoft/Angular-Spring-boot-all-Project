import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';

@Component({
  selector: 'app-viewDoctor',
  templateUrl: './viewDoctor.component.html',
  styleUrls: ['./viewDoctor.component.css']
})
export class ViewDoctorComponent implements OnInit {

  allData: any = [];
  //--------------------show department data--------------
  constructor(private myservice: HmsService) {
    this.myservice.showalldept().subscribe((x) => {
      this.allData = x;
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