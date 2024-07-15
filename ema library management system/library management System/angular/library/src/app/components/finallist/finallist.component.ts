import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-finallist',
  templateUrl: './finallist.component.html',
  styleUrls: ['./finallist.component.css']
})
export class FinallistComponent implements OnInit {

  borrowedBookList: any;
  count:number=1;
  constructor(private service: AdminService) {
    this.borrowedBookList = this.service.getBorrowedBookList();

   

  }

  ngOnInit(): void {
  }


  update(){
    alert("Process Done");
    this.service.updatemystery(this.borrowedBookList).subscribe((response)=>{

    })
  }

}
