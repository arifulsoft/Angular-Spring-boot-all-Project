export class Transection {
    transectionId:any;
    paymentType:any;
    grossSales:any;
    discount:any;
    netSales:any;

    constructor(transectionId:any,paymentType:any,grossSales:any,discount:any,netSales:any){
        this.transectionId=transectionId;
        this.paymentType=paymentType;
        this.grossSales=grossSales;
        this.discount=discount;
        this.netSales=netSales;

    }
}
