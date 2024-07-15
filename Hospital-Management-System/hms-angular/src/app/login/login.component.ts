

import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: any;
  password: any;
  
  constructor(private myservice: HmsService, private router: Router) { }

  ngOnInit(): void { }

  login() {
    if (!this.username || !this.password) {
      alert("Username and password are required");
      return;
    }

    this.myservice.loginByUsername(this.username, this.password).subscribe(
      (data: any) => {
        if (data) {
          switch (data.role.toLowerCase()) {
            case 'admin':
              this.router.navigate(["adminsidebar"]);
              break;
            case 'doctor':
              this.router.navigate(["DoctorSidebarComponent"]);
              break;
            default:
              alert("Invalid role");
              this.router.navigate(["**"]);
              break;
          }
          alert("Congrats, login is successful");
        } else {
          alert("Oops! Username and Password mismatch");
        }
      },
      error => {
        alert("An error occurred while logging in");
        console.error(error);
      }
    );
  }
}
