import { Component, OnInit } from '@angular/core';
import { CarService } from '../services/car.service';

@Component({
  selector: 'app-show-approval-table',
  templateUrl: './show-approval-table.component.html',
  styleUrls: ['./show-approval-table.component.css']
})
export class ShowApprovalTableComponent implements OnInit {

approvalData:any;
  constructor(private carService:CarService) { 

      this.carService.showApprovalTable().subscribe((x)=>{
        this.approvalData=x;
      });
  }

  ngOnInit(): void {
  }
  
  approved(){

  }

  reject(){
    
  }

}
