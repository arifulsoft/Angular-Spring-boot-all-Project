import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { AdminService } from './service/admin.service';
import { LoginComponent } from './components/login/login.component';
import { SuccessComponent } from './components/success/success.component';
import { FailComponent } from './components/fail/fail.component';
import { OtherheaderComponent } from './components/otherheader/otherheader.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { MysterybooksComponent } from './components/mysterybooks/mysterybooks.component';
import { CategorybooksComponent } from './components/categorybooks/categorybooks.component';
import { ViewbooksComponent } from './components/viewbooks/viewbooks.component';
import { ShowcategorybooksComponent } from './components/showcategorybooks/showcategorybooks.component';
import { UserupdateComponent } from './components/userupdate/userupdate.component';
import { BookdetailsComponent } from './components/bookdetails/bookdetails.component';
import { BorrowedDetailsComponent } from './components/borrowed-details/borrowed-details.component';
import { AboutComponent } from './components/about/about.component';
import { ShowalluserdataComponent } from './components/showalluserdata/showalluserdata.component';
import { NewbookinsertComponent } from './components/newbookinsert/newbookinsert.component';
import { ShowborrowbooksComponent } from './components/showborrowbooks/showborrowbooks.component';
import { FooterComponent } from './components/footer/footer.component';
import { FinallistComponent } from './components/finallist/finallist.component';
import { RetunbooksComponent } from './components/retunbooks/retunbooks.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    HomeComponent,
    LoginComponent,
    SuccessComponent,
    FailComponent,
    OtherheaderComponent,
    RegistrationComponent,
    MysterybooksComponent,
    CategorybooksComponent,
    ViewbooksComponent,
    ShowcategorybooksComponent,
    UserupdateComponent,
    BookdetailsComponent,
    BorrowedDetailsComponent,
    AboutComponent,
    ShowalluserdataComponent,
    NewbookinsertComponent,
    ShowborrowbooksComponent,
    FooterComponent,
    FinallistComponent,
    RetunbooksComponent,
  
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }
