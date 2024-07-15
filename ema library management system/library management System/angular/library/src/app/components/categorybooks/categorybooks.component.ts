import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-categorybooks',
  templateUrl: './categorybooks.component.html',
  styleUrls: ['./categorybooks.component.css']
})
export class CategorybooksComponent implements OnInit {
  alldata:any
  constructor(private myservice:AdminService, private router:Router) { 
    this.myservice.showAllCategorieBooks().subscribe((x)=>{
        this.alldata=x;
      });
    
  }

  ngOnInit(): void {
  }

  navigate(){
    this.router.navigate(['details/'+this.alldata.id]);
  }
  getData:any;
  serachcatg(p:any){
    this.myservice.searchcategory(p).subscribe((x)=>{
      this.getData=x;
      this.router.navigateByUrl("showcategorybooks", {state:{response:this.getData}});
    });

  }


}
