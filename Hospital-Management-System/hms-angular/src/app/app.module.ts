import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HmsService } from './hms.service';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { NotfoundpageComponent } from './notfoundpage/notfoundpage.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { ShowDataComponent } from './showData/showData.component';
import { AdminComponent } from './admin/admin.component';
import { PatientComponent } from './patient/patient.component';
import { PatientProfileComponent } from './patient-profile/patient-profile.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { DepartmentComponent } from './department/department.component';
import { App_statusComponent } from './app_status/app_status.component';
import { FindDoctorComponent } from './findDoctor/findDoctor.component';
import { AdminSidebarComponent } from './admin-sidebar/admin-sidebar.component';
import { DoctorSidebarComponent } from './doctor-sidebar/doctor-sidebar.component';
import { FindPatientComponent } from './findPatient/findPatient.component';
import { ViewDoctorComponent } from './viewDoctor/viewDoctor.component';
import { PatientapplyComponent } from './patientapply/patientapply.component';
import { ShowpatientComponent } from './showpatient/showpatient.component';
import { PatientadmissionComponent } from './patientadmission/patientadmission.component';
import { AdmittedpatientComponent } from './admittedpatient/admittedpatient.component';
import { ShowandDischargeComponent } from './showandDischarge/showandDischarge.component';
import { PatientsidebarComponent } from './patientsidebar/patientsidebar.component';
import { AboutComponent } from './about/about.component';
import { GivePrescriptionComponent } from './givePrescription/givePrescription.component';
import { TakeprescriptionComponent } from './takeprescription/takeprescription.component';
import { BillComponent } from './bill/bill.component';
import { ViewPrescriptionComponent } from './viewPrescription/viewPrescription.component';
import { DiagnosticServiceComponent } from './diagnosticService/diagnosticService.component';
import { InvoiceComponent } from './invoice/invoice.component';
import { PrintComponent } from './print/print.component';
import { RecordsComponent } from './records/records.component';
import { PatientBillComponent } from './patientBill/patientBill.component';



@NgModule({
   declarations: [
      AppComponent,
      HomeComponent,
      HeaderComponent,
      FooterComponent,
      NotfoundpageComponent,
      RegisterComponent,
      LoginComponent,
      ShowDataComponent,
      AdminComponent,
      PatientComponent,
      PatientProfileComponent,
      PatientComponent,
      PatientDetailsComponent,
      DepartmentComponent,
      App_statusComponent,
      FindDoctorComponent,
      AdminSidebarComponent,
      DoctorSidebarComponent,
      FindPatientComponent,
      ViewDoctorComponent,
      PatientapplyComponent,
      ShowpatientComponent,
      PatientadmissionComponent,
      AdmittedpatientComponent,
      ShowandDischargeComponent,
      PatientsidebarComponent,
      AboutComponent,
      GivePrescriptionComponent,
      TakeprescriptionComponent,
      BillComponent,
      ViewPrescriptionComponent,
      DiagnosticServiceComponent,
      InvoiceComponent,
      PrintComponent,
      RecordsComponent,
      PatientBillComponent
   ],
   imports: [
	 BrowserModule,
	 AppRoutingModule,
	 FormsModule,
	 HttpClientModule
	],
   providers: [
      HmsService
   ],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
