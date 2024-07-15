import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { RegistrationComponent } from './registration/registration.component';
import { AdminLoginService } from './services/admin-login.service';
import { UserRegistrationService } from './services/user-registration.service';
import { ShowAllUserComponent } from './show-all-user/show-all-user.component';
import { AccountUpdateComponent } from './account-update/account-update.component';
import { AdminAccountComponent } from './admin-account/admin-account.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { UserPageComponent } from './user-page/user-page.component';
import { AdminPageComponent } from './admin-page/admin-page.component';
import { ErrorComponent } from './error/error.component';
import { AdminHeaderComponent } from './admin-header/admin-header.component';
import { AdminSidebarComponent } from './admin-sidebar/admin-sidebar.component';
import { Update2Component } from './update2/update2.component';
import { NewWindowComponent } from './new-window/new-window.component';
import { DeleteComponent } from './delete/delete.component';
import { FooterComponent } from './footer/footer.component';
import { AdminRegistrationComponent } from './admin-registration/admin-registration.component';
import { TableBookingComponent } from './table-booking/table-booking.component';
import { AllCarsComponent } from './all-cars/all-cars.component';
import { SelectedCarsComponent } from './selected-cars/selected-cars.component';
import { PaymentComponent } from './payment/payment.component';
import { ShowAllCarsTableComponent } from './show-all-cars-table/show-all-cars-table.component';

import { ShowCarbookingTableComponent } from './show-carbooking-table/show-carbooking-table.component';
import { DuepaidComponent } from './duepaid/duepaid.component';
import { ShowApprovalTableComponent } from './show-approval-table/show-approval-table.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    RegistrationComponent,
    ShowAllUserComponent,
    AccountUpdateComponent,
    AdminAccountComponent,
    AdminLoginComponent,
    UserPageComponent,
    AdminPageComponent,
    ErrorComponent,
    AdminHeaderComponent,
    AdminSidebarComponent,
    Update2Component,
    NewWindowComponent,
    DeleteComponent,
    FooterComponent,
    AdminRegistrationComponent,
    TableBookingComponent,
    AllCarsComponent,
    SelectedCarsComponent,
    PaymentComponent,
    ShowAllCarsTableComponent,
   
    ShowCarbookingTableComponent,
        DuepaidComponent,
        ShowApprovalTableComponent,
    
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AdminLoginService, UserRegistrationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
