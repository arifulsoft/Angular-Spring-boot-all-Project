import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showpatient',
  templateUrl: './showpatient.component.html',
  styleUrls: ['./showpatient.component.css']
})
export class ShowpatientComponent implements OnInit {

  allpatient: any;
  constructor(private myservice: HmsService, private router: Router) {
    this.myservice.showallpatient().subscribe((x) => {
      this.allpatient = x;
    });
  }

  ngOnInit() {
  }

  getpatient: any;
  approve(p: any) {
    this.myservice.getadmitpatient(p).subscribe((x) => {
      this.getpatient = x;
      this.router.navigateByUrl("patientadmission", { state: { response: this.getpatient } });
    });
  }

  reject(r: any) {
    if (confirm("Are you sure to reject this application ??")) {
      console.log(
        this.myservice.deletepatientapply(r).subscribe(() => {

          this.myservice.showallpatient().subscribe((x) => {
            this.allpatient = x;
            alert("Successfully reject");
            this.router.navigateByUrl("showpatient");
          });

        })
      )
    }
  }



}

