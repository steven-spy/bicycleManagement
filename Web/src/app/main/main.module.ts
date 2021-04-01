import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MainComponent} from "./main.component";
import {NzButtonModule} from "ng-zorro-antd/button";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MainRoutingModule} from "./main-routing.module";
import {UserService} from "../Service/user.service";
import {BicycleTrackService} from "../Service/bicycleTrack.service";
import {LeasePointService} from "../Service/lease-point.service";
import {BicycleInformationService} from "../Service/bicycleInformation.service";
import { BicycleInformationComponent } from './bicycle-information/bicycle-information.component';


@NgModule({
  declarations: [
    MainComponent,
    BicycleInformationComponent
  ],
  providers: [UserService, BicycleTrackService, BicycleInformationService, LeasePointService],
  imports: [
    CommonModule,
    NzButtonModule,
    FormsModule,
    ReactiveFormsModule,
    MainRoutingModule
  ]
})
export class MainModule { }
