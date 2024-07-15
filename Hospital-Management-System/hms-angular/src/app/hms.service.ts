import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Register } from './models/register';
import { Observable } from 'rxjs';
import { Department } from './models/department';
import { App_status } from './models/app_status';
import { Doctor } from './models/doctor';
import { Appointment } from './models/appointment';
import { Patientapply } from './models/patientapply';
import { Admissiontable } from './models/admissiontable';
import { Prescription } from './models/prescription';
import { Payment } from './models/payment';
import { Bill } from './models/bill';
import { BillSum } from './models/billSum';

@Injectable({
  providedIn: 'root'
})
export class HmsService {

constructor(private http:HttpClient) { }



url:any;


//------------------------------------insert data------------------------ 

save(s: Register):Observable<Register> {
  this.url = "http://localhost:8080/save";
  return this.http.post<Register>(this.url, s);
}

//------------------------------------insert data------------------------ 

addPrescription(s: Prescription):Observable<Prescription> {
  this.url = "http://localhost:8080/addprescription";
  return this.http.post<Prescription>(this.url, s);
}

//------------------------------------insert data------------------------ 

addadmission(s: Admissiontable):Observable<Admissiontable> {
  this.url = "http://localhost:8080/addpatientadmission";
  return this.http.post<Admissiontable>(this.url, s);
}

 //------------------------------------- login --------------------- 

 loginByUsername(username: any, password: any): Observable<Register> {

  this.url = "http://localhost:8080/login/";
  return this.http.get<Register>(this.url + username + "/" + password);
}

//--------------------------------------search a patient info ---------------------- 

getadmitpatient(nid:any): Observable<Patientapply> {

  this.url = "http://localhost:8080/getadmitpatient/";
  return this.http.get<Patientapply>(this.url + nid);
}

//-------------insert department------- 
saveDep(s: Appointment):Observable<Appointment> {
  this.url = "http://localhost:8080/saveappointment";
  return this.http.post<Appointment>(this.url, s);
}

//-------------show doctors name------- 
getdocname(s:any):Observable<Doctor> {
  this.url = "http://localhost:8080/getdoctorname/";
  return this.http.get<Doctor>(this.url+s);
}
//-------------------------------------show all data----------------------------

show(): Observable<Register> {
  this.url = "http://localhost:8080/show";
  return this.http.get<Register>(this.url);
}

//-------------------------------------show all patient data---------------------------

showallpatient(): Observable<Patientapply> {
  this.url = "http://localhost:8080/showallpatient";
  return this.http.get<Patientapply>(this.url);
}

//-------------------------------------show all department ----------------------------

showalldept(): Observable<Department> {
  this.url = "http://localhost:8080/showalldept";
  return this.http.get<Department>(this.url);
}

//----------------------show all admitted patient ----------------------------

showalladtpatient(): Observable<Admissiontable> {
  this.url = "http://localhost:8080/getadmittedpatientdata";
  return this.http.get<Admissiontable>(this.url);
}


//------------------------------------insert app_status------------------------ 

status(s: App_status):Observable<App_status> {
  this.url = "http://localhost:8080/saveStatus";
  return this.http.post<App_status>(this.url, s);
}

//==========================post into bill_sum table=================== 

insertpaybill(s: BillSum):Observable<BillSum> {
  this.url = "http://localhost:8080/insertpaybill";
  return this.http.post<BillSum>(this.url, s);
}

//-----------------------------------search by p_id------------------------- 

getpatient(doc_name: any): Observable<Appointment> {

  this.url = "http://localhost:8080/getallpatient/";
  return this.http.get<Appointment>(this.url + doc_name);
}

//-----------------------------------search by p_id------------------------- 

getmedpatient(p_id: any): Observable<Admissiontable> {

  this.url = "http://localhost:8080/getpatienttreat/";
  return this.http.get<Admissiontable>(this.url + p_id);
}

//-------------------------search appointment by p_id------------- 

getpatients(p_id: any): Observable<Appointment> {

  this.url = "http://localhost:8080/getSinglePatient/";
  return this.http.get<Appointment>(this.url + p_id);
}

//----------------------------view prescription by p_id------------- 

getPrescrption(p_id: any): Observable<Prescription> {

  this.url = "http://localhost:8080/getSinglePrescription/";
  return this.http.get<Prescription>(this.url + p_id);
}

//-------------------get all admission patient------------------------- 

getalladmissionpatient(d_id: any): Observable<Admissiontable> {

  this.url = "http://localhost:8080/getalladmissionpatient/";
  return this.http.get<Admissiontable>(this.url + d_id);
}


//---------------------------------update----------------------------

// update(s: Registration): Observable<Registration> {
//   this.url = "http://localhost:8080/update";
//   return this.http.put<Registration>(this.url, s);

// }

//---------------------------delete- patient--------------------------

deletepatient(s: any): Observable<Appointment> {
  this.url = "http://localhost:8080/deletepatient/";
  return this.http.delete<Appointment>(this.url + s);

}

//--------------------------- discharge patient--------------------------

discharge(p_id: any): Observable<Admissiontable> {
  this.url = "http://localhost:8080/dischargepatient/";
  return this.http.delete<Admissiontable>(this.url + p_id);

}

//---------------------------delete- patient application-------------------------- 

deletepatientapply(nid: any): Observable<Patientapply> {
  this.url = "http://localhost:8080/deletepatientapply/";
  return this.http.delete<Patientapply>(this.url+nid);
}

//-------------insert data patient apply------- 
applyforadmit(s: Patientapply):Observable<Patientapply> {
  this.url = "http://localhost:8080/patientapply";
  return this.http.post<Patientapply>(this.url, s);
}


//================bill section=======================

addBillOnAppointment(P:any):Observable<Payment>{
  this.url = "http://localhost:8080/savepaymentonappointment";
  return this.http.post<Payment>(this.url, P);
}

addbillonadmission(pid:any,date:any):Observable<Bill>{
  alert("Bill")
  this.url = "http://localhost:8080/savebillonadmission/"+pid+"/"+date;
  return this.http.get<Bill>(this.url);
}

getpatientId(nid:any):Observable<Admissiontable>{
  this.url = "http://localhost:8080/getpaitentid/"+nid;
  return this.http.get<Admissiontable>(this.url);
}

//================bill section=======================

billPayment(b:any):Observable<Bill>{
  this.url = "http://localhost:8080/savepaymentondischarge";
  return this.http.post<Bill>(this.url, b);
}

updateConsultationFee(ammount:any,id:any):Observable<Payment>{
  this.url = "http://localhost:8080/updateconsultationfee/"+ammount+"/"+id;
  return this.http.get<Payment>(this.url);
}
updateMedicalBill(ammount:any,id:any):Observable<Payment>{
  this.url = "http://localhost:8080/updatemedicalbill/"+ammount+"/"+id;
  return this.http.get<Payment>(this.url);
}

updateTestBill(ammount:any,id:any):Observable<Payment>{
  this.url = "http://localhost:8080/updatetestbill/"+ammount+"/"+id;
  return this.http.get<Payment>(this.url);
}

//==================get all patient data from payment==========================

getAllpatientDataFromPayment(id:any):Observable<Payment>{
  this.url = "http://localhost:8080/getallpatientdatafrompayment/"+id;
  return this.http.get<Payment>(this.url);
}


//==================get all records from payment==========================

getAllRecords(dateFrom:any,dateTo:any):Observable<Payment>{
  this.url = "http://localhost:8080/allRecords/"+ dateFrom + "/" + dateTo;
  return this.http.get<Payment>(this.url);
}











}