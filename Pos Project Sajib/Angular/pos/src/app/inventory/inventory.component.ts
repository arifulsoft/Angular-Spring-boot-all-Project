import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit {

  getalldata:any;
  constructor(private myservice:ProductService, private router: Router) {
    this.myservice.showallproduct().subscribe((x)=>{
      this.getalldata=x;
    });
   }


  ngOnInit(): void {
  }
  
  temp:any;
  getdata:any;
  search(p:any){
    this.myservice.searchBybarcode(p).subscribe((x) => {
      this.getdata = x;
      this.router.navigateByUrl("updateProduct", { state: { response: this.getdata }});
  });

}

}