import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-access-rights',
  templateUrl: './access-rights.component.html',
  styleUrls: ['./access-rights.component.css']
})
export class AccessRightsComponent implements OnInit {

  getalldata:any;

  constructor(private myservice:EmployeeService) {
    this.myservice.showallemployee().subscribe((x)=>{
      this.getalldata=x;
    });
   }

  ngOnInit(): void {
  }

}
