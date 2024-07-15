import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../services/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private myservice: EmployeeService, private router: Router) { }

  email: any;
  password: any;
  loginEmployee: any;

  login(){
     this.myservice.login(this.email, this.password).subscribe((x) => {
      this.loginEmployee = x;
      if ((this.loginEmployee != null)) {
        this.router.navigateByUrl("home", { state: { response: this.loginEmployee } });
      } else {
        this.router.navigateByUrl("fail");
      }
    });


  }

  ngOnInit(): void {
  }

}
