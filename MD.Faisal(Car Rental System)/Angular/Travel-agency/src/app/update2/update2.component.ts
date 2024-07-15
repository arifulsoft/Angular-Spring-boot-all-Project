import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserRegistrationService } from '../services/user-registration.service';

@Component({
  selector: 'app-update2',
  templateUrl: './update2.component.html',
  styleUrls: ['./update2.component.css']
})
export class Update2Component implements OnInit {

  constructor(private router: Router, private myservice: UserRegistrationService) { }
  a_number: any;
  getData:any;
  ngOnInit(): void {
  }

  search() {
    this.myservice.search(this.a_number).subscribe((x) => {
      this.getData = x;
        if(this.getData!=null){
      this.router.navigateByUrl("newwindow",{state:{response:this.getData}});
        }else{
          this.router.navigateByUrl("fail")

        }
    });
    
  }

}
