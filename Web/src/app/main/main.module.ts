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
import { LeasePointComponent } from './lease-point/lease-point.component';
import {NzGridModule} from "ng-zorro-antd/grid";
import {NzInputModule} from "ng-zorro-antd/input";
import {IconsProviderModule} from "../icons-provider.module";
import {NzTableModule} from "ng-zorro-antd/table";
import {NzDrawerModule} from "ng-zorro-antd/drawer";
import {NzDescriptionsModule} from "ng-zorro-antd/descriptions";
import {NzDividerModule} from "ng-zorro-antd/divider";


@NgModule({
  declarations: [
    MainComponent,
    BicycleInformationComponent,
    LeasePointComponent
  ],
  providers: [UserService, BicycleTrackService, BicycleInformationService, LeasePointService],
  imports: [
    CommonModule,
    NzButtonModule,
    FormsModule,
    ReactiveFormsModule,
    MainRoutingModule,
    NzGridModule,
    NzInputModule,
    IconsProviderModule,
    NzTableModule,
    NzDrawerModule,
    NzDescriptionsModule,
    NzDividerModule
  ]
})
export class MainModule { }
