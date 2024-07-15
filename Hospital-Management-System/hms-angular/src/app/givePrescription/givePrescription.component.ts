import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Prescription } from '../models/prescription';
import { Router } from '@angular/router';

@Component({
  selector: 'app-givePrescription',
  templateUrl: './givePrescription.component.html',
  styleUrls: ['./givePrescription.component.css']
})
export class GivePrescriptionComponent implements OnInit {

  search_p_id: number | undefined;
  p_id: number | undefined;
  p_name: string | undefined;
  age: number | undefined;
  d_name: string | undefined;
  problem: string | undefined;
  prescription: string | undefined;
  advice: string | undefined;
  dep_name: string | undefined;

  allpatient: any;

  constructor(private myservice: HmsService,private router:Router) { }

  ngOnInit() { }

  appStatus() {
    if (this.search_p_id) {
      this.myservice.getmedpatient(this.search_p_id).subscribe((patient) => {
        this.allpatient = patient;
        if (this.allpatient) {
          this.p_id = this.allpatient.p_id;
          this.p_name = this.allpatient.p_name;
          this.age = this.allpatient.age;
          this.d_name = this.allpatient.d_name;
          this.problem = this.allpatient.problem;
          this.dep_name = this.allpatient.dep_name;
        }
      });
    }
  }

  prescribe() {
    if (this.p_id && this.p_name && this.age && this.d_name && this.problem && this.prescription && this.advice && this.dep_name) {
      const newPrescription = new Prescription(this.p_id, this.p_name, this.age, this.d_name, this.problem, this.prescription, this.advice, this.dep_name);
      this.myservice.addPrescription(newPrescription).subscribe(() => {
        alert("Prescription added successfully");
      });
    } else {
      alert("Please fill out all required fields.");
    }
  }
}
