import { Component, OnInit } from '@angular/core';
import { UserRegistrationService } from '../services/user-registration.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-all-user',
  templateUrl: './show-all-user.component.html',
  styleUrls: ['./show-all-user.component.css']
})
export class ShowAllUserComponent implements OnInit {

  getAllData: any;
  constructor(private router: Router, private myservice: UserRegistrationService) {
    this.myservice.show().subscribe((x) => { this.getAllData = x });
  }

  ngOnInit(): void {
  }
  // getData: any;
  // a_number: any;

  // search(v:any) {
  //   this.a_number=v;
  //   this.myservice.search(this.a_number).subscribe((x) => {
  //     this.getData = x
  //     this.router.navigateByUrl("newwindow", { state: { response: this.getData } });
  //   });

  // }

}
