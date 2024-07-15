import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SalesSummaryComponent } from './sales-summary/sales-summary.component';
import { SalesByItemComponent } from './sales-by-item/sales-by-item.component';
import { SalesByCategoryComponent } from './sales-by-category/sales-by-category.component';
import { SalesByEmployeeComponent } from './sales-by-employee/sales-by-employee.component';
import { SalesByPaymentTypeComponent } from './sales-by-payment-type/sales-by-payment-type.component';
import { ReceiptsComponent } from './receipts/receipts.component';
import { SalesByModifierComponent } from './sales-by-modifier/sales-by-modifier.component';
import { DiscountComponent } from './discount/discount.component';
import { TaxesComponent } from './taxes/taxes.component';
import { ItemListComponent } from './item-list/item-list.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AccessRightsComponent } from './access-rights/access-rights.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { FailComponent } from './fail/fail.component';
import { HttpClientModule } from '@angular/common/http';
import { EmployeeService } from './services/employee.service';
import { AddProductComponent } from './add-product/add-product.component';
import { HomeRouterComponent } from './home-router/home-router.component';
import { SearchComponent } from './search/search.component';
import { ShowproductComponent } from './showproduct/showproduct.component';
import { HeaderComponent } from './header/header.component';
import { InventoryComponent } from './inventory/inventory.component';
import { UpdateProductComponent } from './update-product/update-product.component';



@NgModule({
  declarations: [
    AppComponent,
    SalesSummaryComponent,
    SalesByItemComponent,
    SalesByCategoryComponent,
    SalesByEmployeeComponent,
    SalesByPaymentTypeComponent,
    ReceiptsComponent,
    SalesByModifierComponent,
    DiscountComponent,
    TaxesComponent,
    ItemListComponent,
    EmployeeListComponent,
    AccessRightsComponent,
    AddCustomerComponent,
    LoginComponent,
    RegistrationComponent,
    HomeComponent,
    FailComponent,
    AddProductComponent,
    HomeRouterComponent,
    SearchComponent,
    ShowproductComponent,
    HeaderComponent,
    InventoryComponent,
    UpdateProductComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
