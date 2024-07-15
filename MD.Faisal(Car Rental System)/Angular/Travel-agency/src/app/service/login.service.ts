import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }
  users: any[] = [
    { id: '100', name: "Jahir", email: "abc", password: "1" },
    { id: '101', name: "Riaft", email: "abc", password: "2" },
    { id: '102', name: "Kamal", email: "abc", password: "3" },
    { id: '103', name: "Karim", email: "abc", password: "4" },
  ];
 public getallusers(){
    return this.users;
  }
  public  data:any;
}
