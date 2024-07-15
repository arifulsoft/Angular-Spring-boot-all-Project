import { Component, OnInit } from '@angular/core';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-expired',
  templateUrl: './expired.component.html',
  styleUrls: ['./expired.component.css']
})
export class ExpiredComponent implements OnInit {

  constructor(private myservice:ControllerrService) { 
    this.myservice.getExpiredList().subscribe((x)=>{
      this.subTotal=0;
      this.totalQuantity=0;
      this.expiredList=x;
      let avg=0;
      let index=0;
      for(let i of this.expiredList){
        this.subTotal=this.subTotal+(i.returnQty*i.purchaseRate);
        this.totalQuantity=this.totalQuantity+i.returnQty
        avg=avg+i.purchaseRate;
        index++;
      }
      // alert("avg "+avg+"\n index "+index)
      this.averagerate=avg/index;
    })
  }

  ngOnInit(): void {
  }

  expiredList:any=[];
  returnexpiredList:any[]=[];
  subTotal:any=0;
  totalQuantity:any=0;
  averagerate:any=0;

  returnSubtotal:any=0;
  returntotalQuantity:any=0;

  addReturnExpiredList(i:any){
    this.returnexpiredList.push(i);
    this.returnSubtotal=0;
    this.returntotalQuantity=0;
    for(let i of this.returnexpiredList){
      this.returnSubtotal=this.returnSubtotal+(i.returnQty*i.purchaseRate);
      this.returntotalQuantity=this.returntotalQuantity+i.returnQty
      
    }

  }

  returnProduct: any[] = []; 
  return: any = {
    returnId: 0,
    returnDate: "",
    supplier: "",
    medicineName: "",
    paking: "",
    genericName: "",
    batchId: "",
    exDate: "",
    pursDate: "",
    invoice: "",
    returnQty: 0,
    purchaseRate: "",
    status: "",
    purshasId: 0,
  }
  addreturn(i: any) {
    this.return = new Object;
    this.return.returnId = 0;
    this.return.returnDate = "";
    this.return.supplier = i.supplier;
    this.return.medicineName = i.medicineName;
    this.return.paking = i.paking;
    this.return.genericName = i.genericName;
    this.return.batchId = i.batchId;
    this.return.exDate = i.exDate;
    this.return.pursDate = i.pursDate;
    this.return.invoice = i.invoice;
    this.return.returnQty = i.returnQty;
    this.return.purchaseRate = i.purchaseRate;
    this.return.status = "Expired Returend"
    this.return.purshasId = i.purchaseId;
    this.returnProduct.push(this.return);
    // this.damageOrReturnQty="";
  }

  confirmReturn(){
    for(let i of this.returnexpiredList){
      this.addreturn(i);
      
    }

    this.myservice.purchaseReturn(this.returnProduct).subscribe(()=>{
      alert("return confirm");
      this.myservice.updateExpaireList(this.returnexpiredList).subscribe((x)=>{
        alert("Status Update")
      })
      this.returnProduct=[];
    });


  }

}
