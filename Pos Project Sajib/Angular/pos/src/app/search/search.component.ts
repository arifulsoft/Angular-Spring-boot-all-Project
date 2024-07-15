import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Product } from '../models/product';
import { Transection } from '../models/transection';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  barcode: any;

  orderQuantity=1;

  transectionQuery:any;

  transectionId:any=10001;
  paymentType:any="Cash Payment";
  GrossSale:any=0;
  Discount:any=0;
  netSale:any=0;
  payAmmount:any=0;
  return:any=0;

  dNetSale:any=0;

  transection:any;
  orders:any[]=[];
  showOrders:any[]=[];
  order:any={id:null,barcode:null,name:'neta',description:'',quantity:null,purchase_rate:null, sales_rate:0,
  size:null,category:0,colors:'johir',stock:0,supplier:''};

  addOrder(){
    this.order=new Object();
    for(let i of this.getdata){
      this.order.id=i.id;
    this.order.barcode=i.barcode;
    this.order.name=i.name;
    this.order.description=i.description;
    this.order.quantity=i.quantity;
    this.order.purchase_rate=i.purchase_rate;
    this.order.sales_rate=i.sales_rate;
    this.order.size=i.size;
    this.order.category=i.category;
    this.order.colors=i.colors;
    this.order.stock=i.stock-this.orderQuantity;
    this.order.supplier=i.supplier;
    }
    
    this.orders.push(this.order)
    
  }

  showOrder:any={barcode:10,name:'neta', sales_rate:0, colors:'johir', quantity:0, total:0};
  addShowOrder(){
    this.showOrder=new Object();
    for(let i of this.getdata){
      
      this.showOrder.barcode=i.barcode;
    this.showOrder.name=i.name;
    this.showOrder.sales_rate=i.sales_rate;
    this.showOrder.colors=i.colors;
    this.showOrder.quantity=this.orderQuantity
    this.showOrder.total=i.sales_rate*this.orderQuantity;
    this.GrossSale=this.GrossSale+this.showOrder.total;
    }
    
    

    this.showOrders.push(this.showOrder)
  }
  multiwork(){
    this.addOrder();
    this.addShowOrder();
    this.getdata=null;
    this.orderQuantity=1;
  }

  calculate(){
    this.netSale=this.GrossSale-this.Discount;
    this.return=this.payAmmount-this.netSale;
  }




  constructor(private myservice: ProductService, private router: Router) {

    this.myservice.getTransectionId().subscribe((x)=>{
      this.transectionQuery=x;
      if(this.transectionQuery!=null){
        this.transectionId=this.transectionQuery.transectionId;
      }
    })

   }



   
  ngOnInit(): void {
  }




  getdata: any;
  search() {
    this.myservice.searchBybarcode(this.barcode).subscribe((x) => {
      this.getdata = x;
      this.barcode=null;
    });
  }

  
  saleConfirm(){
    this.dNetSale=this.GrossSale-this.Discount;
    this.transection=new Transection(this.transectionId,this.paymentType,this.GrossSale,this.Discount,this.dNetSale);
    this.myservice.saveTransection(this.transection).subscribe(()=>{
      alert ("Transection Save");
      this.router.navigateByUrl("receipts");
      this.myservice.updateSalesProductStock(this.orders).subscribe(()=>{
        // alert("product Update")
      })
      
    })
  }


}

// salesId int AI PK 
// salesItem varchar(45) 
// salesCategory varchar(45) 
// salesDate date 
// paymentType varchar(45) 
// quantity int 
// grossSales int 
// discount int 
// netSales int 
// profit int
