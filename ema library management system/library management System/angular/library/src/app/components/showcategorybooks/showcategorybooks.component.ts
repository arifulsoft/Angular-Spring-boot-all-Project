import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showcategorybooks',
  templateUrl: './showcategorybooks.component.html',
  styleUrls: ['./showcategorybooks.component.css']
})
export class ShowcategorybooksComponent implements OnInit {

  getData:any;

  constructor( private router: Router) { 
    this.getData=this.router.getCurrentNavigation()?.extras.state?.["response"];
  }

  ngOnInit(): void {
  }

}