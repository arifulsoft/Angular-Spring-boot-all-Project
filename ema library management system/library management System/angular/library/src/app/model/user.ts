export class User {
    id:any;
    name:any;
    email:any;
    address:any;
    phone:any;
    password:any;
    gender:any;
    borrowedbook:any;

    constructor(id:any,name:any,email:any,address:any,phone:any,password:any,gender:any,borrowedbook:any){
        this.id=id;
        this.name=name;
        this.email=email;
        this.address=address;
        this.phone=phone;
        this.password=password;
        this.gender=gender;
        this.borrowedbook= borrowedbook;
    }
}