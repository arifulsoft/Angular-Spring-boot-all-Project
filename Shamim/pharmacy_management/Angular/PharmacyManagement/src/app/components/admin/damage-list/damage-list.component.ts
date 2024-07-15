import { Component, OnInit } from '@angular/core';
import { ControlContainer } from '@angular/forms';
import { ControllerrService } from 'src/app/service/controllerr.service';

@Component({
  selector: 'app-damage-list',
  templateUrl: './damage-list.component.html',
  styleUrls: ['./damage-list.component.css']
})
export class DamageListComponent implements OnInit {

  constructor(private myservice: ControllerrService) {
    this.myservice.getDamegeList(this.status).subscribe((x) => {
      this.damageListSummary = x
    })
  }

  ngOnInit(): void {
  }


  status: any = "damaged";
  service: any = "damage-List-Summery";
  damageListSummary: any[] = []
  damageListdetails: any = [];
  subTotal:any=0;

  showDetails(val: any) {
    this.subTotal=0;
    this.service = "damage-details";
    this.myservice.getallDamegeList(val).subscribe((x) => {
      this.damageListdetails = x;
      for(let i of this.damageListdetails){
        this.subTotal=this.subTotal+(i.returnQty*i.purchaseRate);
      }
    })
  }

  damageList() {

    this.service = "damage-List-Summery";
  }
  returnList() {

    this.service = "damage-details";
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
    this.return.status = "Damaged Returend"
    i.status="Returend"
    this.return.purshasId = i.purshasId;
    this.returnProduct.push(this.return);
    // this.damageOrReturnQty="";
  }
  // { "damageId": 1, "damageDate": null, "supplier": "Reneta", "medicineName": "Paracitamol", "paking": 10, "genericName": "Dymando", "batchId": "B1250", "exDate": "2024-12-31", "pursDate": "2024-06-04", "invoice": "100010", "returnQty": 0, "purchaseRate": 8, "status": "Damaged", "purshasId": 7 },
   confirmReturn(){

     for(let i of this.damageListdetails){
      this.addreturn(i);
    }
    this.myservice.purchaseReturn(this.returnProduct).subscribe(()=>{
      alert("return confirm");
      this.myservice.updateDamege(this.damageListdetails).subscribe(()=>{
        alert("Damage Status Update");
      })
      this.returnProduct=[];
    })
  }

}
