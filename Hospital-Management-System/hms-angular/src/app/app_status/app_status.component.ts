import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { App_status } from '../models/app_status';

@Component({
  selector: 'app-app_status',
  templateUrl: './app_status.component.html',
  styleUrls: ['./app_status.component.css']
})
export class App_statusComponent implements OnInit {
  p_id: any;
  allpatient: any;

  constructor(private myservice: HmsService) { }

  ngOnInit() {
  }

  appStatus() {
    this.myservice.getpatients(this.p_id).subscribe((x) => {
      this.allpatient = x;
    });
  }

}
