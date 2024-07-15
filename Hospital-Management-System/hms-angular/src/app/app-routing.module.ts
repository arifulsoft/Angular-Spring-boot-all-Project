import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { NotfoundpageComponent } from './notfoundpage/notfoundpage.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { PatientComponent } from './patient/patient.component';
import { PatientDetailsComponent } from './patient-details/patient-details.component';
import { PatientProfileComponent } from './patient-profile/patient-profile.component';
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

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'header', component: HeaderComponent },
  { path: 'footer', component: FooterComponent },
  { path: 'about', component: AboutComponent },

  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },

  { path: 'admin', component: AdminComponent },
  { path: 'adminsidebar', component: AdminSidebarComponent },
  { path: 'admittedpatient', component: AdmittedpatientComponent },

  { path: 'patient', component: PatientComponent },
  { path: 'showpatient', component: ShowpatientComponent },
  { path: 'patientadmission', component: PatientadmissionComponent },
  { path: 'patient-details', component: PatientDetailsComponent },
  { path: 'patient-profile', component: PatientProfileComponent },
  { path: 'department', component: DepartmentComponent },
  { path: 'app_status', component: App_statusComponent },
  { path: 'findDoctor', component: FindDoctorComponent },
  { path: 'AdminSidebarComponent', component: AdminSidebarComponent },
  { path: 'DoctorSidebarComponent', component: DoctorSidebarComponent },
  { path: 'findPatient', component: FindPatientComponent },
  { path: 'viewdoctor', component: ViewDoctorComponent },
  { path: 'patientapply', component:PatientapplyComponent },
  { path: 'showandDischarge', component:ShowandDischargeComponent },
  { path: 'patientsidebar', component:PatientsidebarComponent},
  { path: 'takeprescription', component:TakeprescriptionComponent},
  { path: 'GivePrescriptionComponent', component:GivePrescriptionComponent},
  { path: 'bill', component:BillComponent},
  { path: 'ViewPrescriptionComponent', component:ViewPrescriptionComponent},
  { path: 'DiagnosticServiceComponent', component:DiagnosticServiceComponent},
  { path: 'invoice', component:InvoiceComponent},
  { path: 'PrintComponent', component:PrintComponent},
  { path: 'RecordsComponent', component:RecordsComponent},
  { path: 'PatientBillComponent', component:PatientBillComponent},



  { path: '**', component: NotfoundpageComponent }




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
