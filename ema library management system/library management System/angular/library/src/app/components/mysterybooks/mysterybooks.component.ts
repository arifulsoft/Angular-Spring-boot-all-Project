import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-mysterybooks',
  templateUrl: './mysterybooks.component.html',
  styleUrls: ['./mysterybooks.component.css']
})
export class MysterybooksComponent implements OnInit {

  getdata:any;
  constructor(private myservice:AdminService) { 
this.myservice.showAllMysteryBooks().subscribe((x)=>{this.getdata=x});
  }

  ngOnInit(): void {
  }


}
