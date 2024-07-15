export class Product {
    id:any;
    barcode:any;
    name:any;
    description:any;
    quantity:any;
    purchase_rate:any;
    sales_rate:any;
    size:any;
    category:any;
    colors:any;
    stock:any;
    supplier:any;

    constructor(id:any,barcode:any,name:any,description:any,quantity:any,purchase_rate:any,sales_rate:any,size:any,category:any,colors:any,stock:any,supplier:any){
        this.id=id;
        this.barcode=barcode;
        this.name=name;
        this.description=description;
        this.quantity=quantity;
        this.purchase_rate=purchase_rate;
        this.sales_rate=sales_rate;
        this.size=size;
        this.category=category;
        this.colors=colors;
        this.stock=stock;
        this.supplier=supplier;

    }
}
