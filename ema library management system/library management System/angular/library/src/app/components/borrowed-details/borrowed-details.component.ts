import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-borrowed-details',
  templateUrl: './borrowed-details.component.html',
  styleUrls: ['./borrowed-details.component.css']
})
export class BorrowedDetailsComponent implements OnInit {

  borrowedBookList: any;
  constructor(
    private service: AdminService
  ) {
    this.borrowedBookList = this.service.getBorrowedBookList();

  }

  ngOnInit(): void {
  }

  delete(b: any) {
    this.service.deleteBorrowed(b);
  }


  // passallborrowedlist from service 

  // borrowedBookList_Object:any;
  // borrowedAllBookList() {
  //   this.borrowedBookList_Object= this.borrowedBookList
  //   this.service.saveBorrowedBookList(this.borrowedBookList_Object).subscribe((data: any) => {

  //     alert("success")
  //   },
  // (error)=>{
  //   alert("error")
  // })
  // }



}
