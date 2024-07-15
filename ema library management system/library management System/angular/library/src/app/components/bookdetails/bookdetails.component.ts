import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AdminService } from '../../service/admin.service';
import { Mystery } from 'src/app/model/mystery';

@Component({
  selector: 'app-bookdetails',
  templateUrl: './bookdetails.component.html',
  styleUrls: ['./bookdetails.component.css']
})
export class BookdetailsComponent implements OnInit {

  bookId:any;
  bookDetails:any;
  constructor(private route:ActivatedRoute,private service:AdminService) { 

    this.bookId=route.snapshot.params["bookNumber"];
    this.service.getBookByNumber(this.bookId).subscribe(
      (data:any)=>{
        this.bookDetails=data;
      }
    )
  }

  ngOnInit(): void {
  }


  addToBorrowList(b:Mystery){
    this.service.getBorrowedBookList().push(b);
  }

}
