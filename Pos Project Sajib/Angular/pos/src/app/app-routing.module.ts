import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { RegistrationComponent } from './registration/registration.component';
import { FailComponent } from './fail/fail.component';
import { AddProductComponent } from './add-product/add-product.component';
import { SearchComponent } from './search/search.component';
import { ShowproductComponent } from './showproduct/showproduct.component';
import { HeaderComponent } from './header/header.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AccessRightsComponent } from './access-rights/access-rights.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { InventoryComponent } from './inventory/inventory.component';
import { ReceiptsComponent } from './receipts/receipts.component';
import { SalesSummaryComponent } from './sales-summary/sales-summary.component';
import { UpdateProductComponent } from './update-product/update-product.component';


const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'login', component:LoginComponent},
  {path:'home',component:HomeComponent},
  {path:'registration', component:RegistrationComponent},
  {path: 'fail', component:FailComponent},
  { path: 'addProduct',component:AddProductComponent},
  {path: 'search',component:SearchComponent},
  {path: 'showproduct',component:ShowproductComponent},
  {path: 'header', component:HeaderComponent},
  {path: 'employeeList',component:EmployeeListComponent},
  {path: 'accessRight', component:AccessRightsComponent},
  { path: 'addCustomer', component:AddCustomerComponent},
  {path: 'inventory', component:InventoryComponent},
  {path: 'receipts', component:ReceiptsComponent},
  {path: 'salesSummary', component:SalesSummaryComponent},
  {path: 'updateProduct', component:UpdateProductComponent}




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
