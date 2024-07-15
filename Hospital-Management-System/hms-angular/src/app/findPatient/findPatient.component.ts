import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-findPatient',
  templateUrl: './findPatient.component.html',
  styleUrls: ['./findPatient.component.css']
})
export class FindPatientComponent implements OnInit {
  doc_name: any;

  allpatient: any=[];

  constructor(private myservice: HmsService, private router: Router) { }

  ngOnInit() {
  }

  searchPatient() {
    this.myservice.getpatient(this.doc_name).subscribe((x) => {
      this.allpatient = x;
      
    });

  }

  delete(p: any) {
    if (confirm("Do you want to delete this patient " +  + "?")) {
      console.log(
        this.myservice.deletepatient(p).subscribe(() => {
          this.myservice.getpatient(this.doc_name).subscribe((x) => {
            this.allpatient = x;
            alert("Successfully delete");
            this.router.navigateByUrl("findPatient");
            
          });

        })
    )
    }
  }
}