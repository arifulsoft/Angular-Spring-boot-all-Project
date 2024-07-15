import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  id: any;
  name:any;
  email:any;
  address:any;
  phone:any;
  password:any;
  gender:any;
  borrowedbook:any;

  
  alldata:any;

  constructor(private myservice: AdminService) { }

  ngOnInit(): void {
  }

  insert(){
    this.alldata=new User(this.id,this.name,this.email,this.address,this.phone,this.password,this.gender,this.borrowedbook);
    this.myservice.insert(this.alldata).subscribe(()=>{ });
    alert("Registration Completed");
  }
}

