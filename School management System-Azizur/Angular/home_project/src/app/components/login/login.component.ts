import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admindetail } from 'src/app/models/admindetail';
import { SchoolService } from 'src/app/services/school.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private myservice:SchoolService,private router: Router) { }
  email:any;
  password:any;
  loginUser: any;

  ngOnInit(): void {
  }

login(){

  this.myservice.loginByEmail(this.email, this.password).subscribe((x) => {
    this.loginUser = x;
    if ((this.loginUser != null && this.loginUser.role == 'admin')) {
      this.router.navigateByUrl("adminpage", { state: { response: this.loginUser } });
    } 
    else if ((this.loginUser != null) && this.loginUser.role == 'student') {
      this.router.navigateByUrl("studentpage", { state: { response: this.loginUser } });
    }  else if ((this.loginUser != null) && this.loginUser.role == 'teacher') {
      this.router.navigateByUrl("teacherpage", { state: { response: this.loginUser } });
    }
    
    
    
    else {
      // this.router.navigateByUrl("failpage");
      alert("Wrong Password!Please Enter Correct Password")
    }
  });


}


}
