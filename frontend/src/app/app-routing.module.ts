import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './components/login/login.component';
import {RegistrationComponent} from './components/registration/registration.component';
import {LogoutComponent} from './components/logout/logout.component';
import {PizzasComponent} from './components/pizzas/pizzas.component';


const routes: Routes = [
  {path: '', component: LoginComponent},
  {path: 'registration', component: RegistrationComponent},
  {path: 'logout', component: LogoutComponent},
  {path: 'pizzas', component: PizzasComponent}
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
