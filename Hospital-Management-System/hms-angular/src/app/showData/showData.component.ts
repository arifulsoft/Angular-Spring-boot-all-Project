import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showData',
  templateUrl: './showData.component.html',
  styleUrls: ['./showData.component.css']
})
export class ShowDataComponent implements OnInit {

  show: any;

  constructor(private myservice: HmsService, private router: Router) {
    this.myservice.show().subscribe((x) => {
      this.show = x
    });
    this.show = this.router.getCurrentNavigation()?.extras.state?.["response"];   
  }

  ngOnInit() {
  }

}
