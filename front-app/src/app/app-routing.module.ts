import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {KeynotesComponent} from "./keynotes/keynotes.component";
import {ConferencesComponent} from "./conferences/conferences.component";
import {AuthGuard} from "./guards/auth.guard";

const routes: Routes = [
  {path : "keynotes", component : KeynotesComponent, canActivate : [AuthGuard], data : {roles :['ADMIN']}},
  {path : "conferences", component : ConferencesComponent, canActivate : [AuthGuard], data : {roles :['ADMIN']}},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
