import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RegistrationComponent } from './registration/registration.component';
import { ShowAllUserComponent } from './show-all-user/show-all-user.component';
import { AccountUpdateComponent } from './account-update/account-update.component';
import { AdminAccountComponent } from './admin-account/admin-account.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserPageComponent } from './user-page/user-page.component';
import { ErrorComponent } from './error/error.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { Update2Component } from './update2/update2.component';
import { NewWindowComponent } from './new-window/new-window.component';
import { FailComponent } from './fail/fail.component';
import { AdminRegistrationComponent } from './admin-registration/admin-registration.component';
import { TableBookingComponent } from './table-booking/table-booking.component';
import { AllCarsComponent } from './all-cars/all-cars.component';
import { SelectedCarsComponent } from './selected-cars/selected-cars.component';
import { PaymentComponent } from './payment/payment.component';
import { ShowAllCarsTableComponent } from './show-all-cars-table/show-all-cars-table.component';
import { ShowCarbookingTableComponent } from './show-carbooking-table/show-carbooking-table.component';
import { DuepaidComponent } from './duepaid/duepaid.component';
import { ShowApprovalTableComponent } from './show-approval-table/show-approval-table.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'header', component: HeaderComponent },
  { path: 'registration', component: RegistrationComponent },
  { path: 'showAllUser', component: ShowAllUserComponent },
  { path: 'accountUpdate', component: AccountUpdateComponent },
  { path: 'update2', component: Update2Component },
  { path: 'adminAccount', component: AdminAccountComponent },
  { path: 'adminLogin', component: AdminLoginComponent },
  { path: 'userPage', component: UserPageComponent },
  { path: 'error', component: ErrorComponent },
  { path: 'adminPage', component: AdminPageComponent },
  { path: 'newwindow', component: NewWindowComponent },
  { path: 'fail', component: FailComponent },
  { path: 'admin_registration', component: AdminRegistrationComponent },
  { path: 'table-booking', component: TableBookingComponent },
  { path: 'allcars', component: AllCarsComponent },
  { path: 'showCars', component: SelectedCarsComponent },
  {path:'payment',component:PaymentComponent},
  {path:'showAllCarsTable',component:ShowAllCarsTableComponent},
  {path:'showCarbookingTable',component:ShowCarbookingTableComponent},
  {path:'duepaid',component:DuepaidComponent},
  {path:'showApprovalTable',component:ShowApprovalTableComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
