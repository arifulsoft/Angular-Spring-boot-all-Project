import { Component, OnInit } from '@angular/core';
import { AdminLoginService } from '../services/admin-login.service';

@Component({
  selector: 'app-admin-account',
  templateUrl: './admin-account.component.html',
  styleUrls: ['./admin-account.component.css']
})
export class AdminAccountComponent implements OnInit {

  getAllData:any;

  constructor(private myservice:AdminLoginService) { 

    this.myservice.showAdmin().subscribe((x)=>{this.getAllData=x});
  }

  ngOnInit(): void {
  }
  
}
