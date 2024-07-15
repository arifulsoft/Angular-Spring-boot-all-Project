import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';

@Component({
  selector: 'app-viewPrescription',
  templateUrl: './viewPrescription.component.html',
  styleUrls: ['./viewPrescription.component.css']
})
export class ViewPrescriptionComponent implements OnInit {

  p_id: any;

  myPrescription: any=[];

  constructor(private myservice: HmsService) { }

  ngOnInit() {
  }

  viewPrescription() {
    this.myservice.getPrescrption(this.p_id).subscribe((x) => {
      this.myPrescription = x;
      
    });
  }
}