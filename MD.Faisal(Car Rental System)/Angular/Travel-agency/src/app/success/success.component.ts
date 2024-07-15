import { Component, OnInit } from '@angular/core';
import { LoginService } from '../service/login.service';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {
  xyz:any;
  constructor(private myservice:LoginService) { 
    this.xyz=this.myservice.data;
  }

  ngOnInit(): void {
  }

}
