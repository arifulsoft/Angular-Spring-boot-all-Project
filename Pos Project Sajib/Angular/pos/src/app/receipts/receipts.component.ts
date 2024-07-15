import { Component, OnInit } from '@angular/core';
import { TransectionService } from '../services/transection.service';

@Component({
  selector: 'app-receipts',
  templateUrl: './receipts.component.html',
  styleUrls: ['./receipts.component.css']
})
export class ReceiptsComponent implements OnInit {

  getallTransection:any;
  
  constructor(private myservice:TransectionService) {
    this.myservice.showalltransection().subscribe((x)=>{
      this.getallTransection=x;
    });
   }

  ngOnInit(): void {
  }

  print(){
    window.print();
  }

}
