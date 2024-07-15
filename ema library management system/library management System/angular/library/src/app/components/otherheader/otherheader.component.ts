import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-otherheader',
  templateUrl: './otherheader.component.html',
  styleUrls: ['./otherheader.component.css']
})
export class OtherheaderComponent implements OnInit {
  bname:any;

  getdata:any;
  constructor(private myservice:AdminService, private router: Router) {
    // this.myservice.showAllMysteryBooks().subscribe((x)=>{
    //   this.getdata=x;
    // });
   }

  ngOnInit(): void {
  }

  searchbook(){
    this.myservice.searckbookbyname(this.bname).subscribe((x) => {
      this.getdata=x;
      this.router.navigateByUrl("viewbooks", {state:{response:this.getdata}});

    });
  }

}
