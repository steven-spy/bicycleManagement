import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {MainComponent} from "./main.component";
import {BicycleInformationComponent} from "./bicycle-information/bicycle-information.component";
// import {BicycleInformationComponent} from "./bicycle-information/bicycle-information.component";
// import {BicycleRepairComponent} from "./bicycle-repair/bicycle-repair.component";
// import {LeasePointComponent} from "./lease-point/lease-point.component";
// import {BicycleInformationModelComponent} from "./bicycle-information/bicycle-information-model/bicycle-information-model.component";


const routes: Routes = [
  {
    path: '',
    component: MainComponent,
    children: [
      {
        path: 'bicycleInformation',
        component: BicycleInformationComponent
      },
      // {
      //   path: 'bicycleInformationModel',
      //   component: BicycleInformationModelComponent
      // },
      // {
      //   path: 'bicycleRepair',
      //   component: BicycleRepairComponent
      // },
      // {
      //   path: 'leasePoint',
      //   component: LeasePointComponent
      // }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MainRoutingModule {
}
