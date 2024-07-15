import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showandDischarge',
  templateUrl: './showandDischarge.component.html',
  styleUrls: ['./showandDischarge.component.css']
})
export class ShowandDischargeComponent implements OnInit {
  getallPatient:any=[];
  constructor(private myservice:HmsService, private router:Router) {
    this.myservice.showalladtpatient().subscribe((x)=>{
      this.getallPatient=x;
    })
   }

  ngOnInit() {
  }

  delete(r: any) {
    if (confirm("Do you want to discharge this patient ??")) {
      console.log(
        this.myservice.discharge(r).subscribe(() => {

          this.myservice.showalladtpatient().subscribe((x)=>{
            this.getallPatient=x;
            alert("Discharge successful");
            this.router.navigateByUrl("showandDischarge");
          })

        })
      )
    }
  }

}
