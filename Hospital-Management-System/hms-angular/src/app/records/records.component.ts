import { Component, OnInit } from '@angular/core';
import { HmsService } from '../hms.service';

@Component({
  selector: 'app-records',
  templateUrl: './records.component.html',
  styleUrls: ['./records.component.css']
})
export class RecordsComponent implements OnInit {

  dateFrom: any;
  dateTo: any;

  records: any;

  constructor(private myservice: HmsService) { }

  searchRecords() {
    this.myservice.getAllRecords(this.dateFrom, this.dateTo).subscribe((x) => {
      this.records = x;

    });

  }

  ngOnInit() {
  }

}
