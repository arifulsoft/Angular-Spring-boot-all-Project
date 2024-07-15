import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HeaderComponent } from './components/header/header.component';
import { HomeComponent } from './components/home/home.component';
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


const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:"header",component:HeaderComponent},
  {path:"login",component:LoginComponent},
  {path:"success",component:SuccessComponent},
  {path:"fail",component:FailComponent},
  {path:"otherheader",component:OtherheaderComponent},
  {path:"home",component:HomeComponent},
  {path:"registration",component:RegistrationComponent},
  {path:"mysterybooks",component:MysterybooksComponent},
  {path:'mysterybooks/:id', component:MysterybooksComponent},
  {path:"categorybooks",component:CategorybooksComponent},
  {path:"viewbooks",component:ViewbooksComponent},
  {path:"showcategorybooks",component:ShowcategorybooksComponent},
  {path:"userupdate",component:UserupdateComponent},
  {path:"bookdetails/:bookNumber",component:BookdetailsComponent},
  {path:"borrowedDetails",component:BorrowedDetailsComponent},
  {path:"about",component:AboutComponent},
  {path:"showalluserdata",component:ShowalluserdataComponent},
  {path:"newbookinsert",component:NewbookinsertComponent},
  {path:"showborrowbooks",component:ShowborrowbooksComponent},
  {path:"footer",component:FooterComponent},
  {path:"finallist",component:FinallistComponent},
  {path:"returnbook",component:RetunbooksComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
