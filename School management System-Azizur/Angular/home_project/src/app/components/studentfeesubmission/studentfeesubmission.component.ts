import { Component, OnInit } from '@angular/core';
import { FeeManagementRequestDTO } from 'src/app/models/feemanagementrequestdto';
import { FeePaymentDTO } from 'src/app/models/feepaymentdto';
import { SchoolService } from 'src/app/services/school.service';
declare var $: any;

@Component({
  selector: 'app-studentfeesubmission',
  templateUrl: './studentfeesubmission.component.html',
  styleUrls: ['./studentfeesubmission.component.css']
})
export class StudentfeesubmissionComponent implements OnInit {

  queryMonthName:any;
  queryYearName:any;
  allFeeNameList:string[]=[];
  monthNameList:string[]=[];
  lastFiveYears:string[]=[];
  classNameList:string[]=[];
  feePaymentList:FeePaymentDTO[] = [];
  queryObject: FeeManagementRequestDTO = {};
  paymentStatusList:string[]=[];
  feePaymentModalObj: FeePaymentDTO = {};
  hasAnyPendingStatus:boolean = false;

  constructor(private schoolService: SchoolService) { }

  ngOnInit(): void {
    this.allFeeNameList = ["Monthly Fee", "Registration Fee", "Addmission Fee", "Exam Fee"];
    this.classNameList = this.schoolService.getClassList();
    this.paymentStatusList = ["", "Pending", "Approved"];
    this.monthNameList = ["", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    this.lastFiveYears = this.getLastFiveYears();    
  }

  getLastFiveYears() {
    let currentYear = new Date().getFullYear();
    let years = [];
    for (let i = currentYear - 5; i <= currentYear; i++) {  
      years.push(i + "");
    }

    return years;
  }

  test(fee:any) {
    console.log(fee);
  }
  feeNameChanged() {
    if (this.queryObject.fee_name == 'Monthly Fee') {
      const date = new Date();
      this.queryMonthName = date.toLocaleString('default', { month: 'long' });
      this.queryYearName = date.getFullYear();
    }
  }

  queryForFeeRecords() {
    if (this.queryObject.fee_name == 'Monthly Fee') {
      this.queryObject.monthName = this.queryMonthName + ' - ' + this.queryYearName;
    }

    this.schoolService.getFeeManagementRecords(this.queryObject).subscribe(res => {
      this.feePaymentList = res;
      this.hasAnyPendingStatus = this.feePaymentList.filter(item => item.payment_status == 'Pending').length > 0;
    });
  }

  clearQuery() {
    this.queryObject = {};
  }

  showModal(selector: string) {
    ($(selector as any) as any).modal('show');
  }

  hideModal(selector: string) {
    ($(selector as any) as any).modal('hide');
  }

  submitPayment(feePayment:FeePaymentDTO, selector: string) {
    this.showModal(selector);
    this.feePaymentModalObj = feePayment;
  }

  changePaymentStatus(newPaymentStatus:string, selector: string) {
    this.feePaymentModalObj.payment_status = newPaymentStatus;
    let feePayListToUpdate:FeePaymentDTO[] = [];
    feePayListToUpdate.push(this.feePaymentModalObj);
    this.schoolService.submitPayment(feePayListToUpdate).subscribe(() => {
      this.hideModal(selector);
      this.queryForFeeRecords();
    });
  }


}
