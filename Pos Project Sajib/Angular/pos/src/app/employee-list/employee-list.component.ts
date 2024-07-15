import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  getalldata:any;

  constructor(private myservice:EmployeeService) {
    this.myservice.showallemployee().subscribe((x)=>{
      this.getalldata=x;
    });
   }

  ngOnInit(): void {
  }

}
