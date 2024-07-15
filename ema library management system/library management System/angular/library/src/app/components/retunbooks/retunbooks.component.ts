import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-retunbooks',
  templateUrl: './retunbooks.component.html',
  styleUrls: ['./retunbooks.component.css']
})
export class RetunbooksComponent implements OnInit {
  borrowedBookList: any;
  constructor(private service: AdminService) {
    this.borrowedBookList = this.service.getBorrowedBookList();

  }

  ngOnInit(): void {
  }
  bookNumber:any;

  returnBook(){


   alert("Process Complete");
    this.service.updatemysterybook(this.bookNumber).subscribe((response)=>{

    })
  }


}
