import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-showalluserdata',
  templateUrl: './showalluserdata.component.html',
  styleUrls: ['./showalluserdata.component.css']
})
export class ShowalluserdataComponent implements OnInit {

  getdata:any;
  constructor(private myservice:AdminService) { 
this.myservice.showalluserdata().subscribe((x)=>{this.getdata=x});
  }

  ngOnInit(): void {
  }

}
