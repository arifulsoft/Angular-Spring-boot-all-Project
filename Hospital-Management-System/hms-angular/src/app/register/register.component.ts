
import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Register } from '../models/register';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  username: any;
  email: any;
  password: any;
  role: any;

  constructor(private myservice: HmsService) { }

  ngOnInit(): void { }

  register(): void {
    if (!this.username || !this.email || !this.password || !this.role) {
      alert("All fields are required");
      return;
    }

    const registration = new Register(this.username, this.email, this.password, this.role);
    this.myservice.save(registration).subscribe(
      () => {
        alert("Registration is successful");
      },
      error => {
        alert("An error occurred during registration");
        console.error(error);
      }
    );
  }
}
