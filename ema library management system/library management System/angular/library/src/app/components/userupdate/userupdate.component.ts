import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/model/user';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-userupdate',
  templateUrl: './userupdate.component.html',
  styleUrls: ['./userupdate.component.css']
})
export class UserupdateComponent implements OnInit {
  constructor(private myservice: AdminService, private router: Router) { }

  id: any;
  name: any;
  email: any;
  address: any;
  phone: any;
  password:any;
  gender:any;
  borrowedbook:any;

  searchUser: any;
  ngOnInit(): void {
  }
  searchuser() {
    this.myservice.searchById(this.id).subscribe((x) => {
      this.searchUser = x;
      this.id = this.searchUser.id;
      this.name = this.searchUser.name;
      this.email = this.searchUser.email;
      this.address = this.searchUser.address;
      this.phone = this.searchUser.phone;
      this.password = this.searchUser.password;
      this.gender = this.searchUser.gender;
      this.borrowedbook=this.searchUser.borrowedbook;


      // if ((this.searchUser != null)) {
      //   this.router.navigateByUrl("search", { state: { response: this.searchUser } });
      // } else {
      //   this.router.navigateByUrl("fail");
      // }

    });
  }

  update() {
    this.searchUser = new User(this.id, this.name, this.email,this.address, this.phone, this.password,this.gender,this.borrowedbook);
    this.myservice.update(this.searchUser).subscribe(() => { });
    alert("Data Updated");
  }
}
