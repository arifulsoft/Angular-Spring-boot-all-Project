import { Component, OnInit } from '@angular/core';
import { Mystery } from 'src/app/model/mystery';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-newbookinsert',
  templateUrl: './newbookinsert.component.html',
  styleUrls: ['./newbookinsert.component.css']
})
export class NewbookinsertComponent implements OnInit {
  number: any;
  name:any;
  writer:any;
  image:any;
  stock:any;
  categoryname:any;
  bookshelf:any;

  
  alldata:any;

  constructor(private myservice: AdminService) { }

  ngOnInit(): void {
  }

  insertnewbook(){
    this.alldata=new Mystery(this.number,this.name,this.writer,this.image,this.stock,this.categoryname,this.bookshelf);
    this.myservice.insertnewbook(this.alldata).subscribe(()=>{ });
    alert("Book Inserted");
  }
}
