import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../services/employee.service';
import { Router } from '@angular/router';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private myservice:EmployeeService, private router: Router) { }

  id:any;
  name:any;
  phone:any;
  email:any;
  password:any;
  role:any;
  
  allEmployee: any;

  employee(){

    this.allEmployee = new Employee(this.id,this.name,this.phone,this.email,this.password,this.role);
    this.myservice.employee(this.allEmployee).subscribe(()=>{
      this.router.navigateByUrl("login");
      alert("Registration Success");
    });

  }


  ngOnInit(): void {
  }

}
