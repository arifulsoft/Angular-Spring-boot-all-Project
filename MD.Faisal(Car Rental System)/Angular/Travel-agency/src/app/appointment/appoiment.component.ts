import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-appoiment',
  templateUrl: './appoiment.component.html',
  styleUrls: ['./appoiment.component.css']
})
export class AppoimentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  name:string="";
  f_name:string="";
  age:string="";
  address:string="";
  p_number:number=0;
  password:string="";

  save(){
    
  }


}
