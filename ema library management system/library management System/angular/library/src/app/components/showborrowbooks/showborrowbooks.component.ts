import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-showborrowbooks',
  templateUrl: './showborrowbooks.component.html',
  styleUrls: ['./showborrowbooks.component.css']
})
export class ShowborrowbooksComponent implements OnInit {

  getdata:any;
  constructor(private myservice:AdminService) { 
this.myservice.showAllMysteryBooks().subscribe((x)=>{this.getdata=x});
  }

  ngOnInit(): void {
  }

}
