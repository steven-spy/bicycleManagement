import {Component, OnInit} from '@angular/core';

declare var BMap: any;

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent implements OnInit {
  location: any;

  constructor() {
  }

  ngOnInit() {
    this.getMap();
  }


// 地图要放到函数里。
  getMap() {
    const map = new BMap.Map('map');                   //创建地图实例
    const point = new BMap.Point(121.59347778, 38.94870994);     //创建点坐标
    map.centerAndZoom(point, 15);                      //初始化地图，设置中心点坐标和地图级别
    map.enableScrollWheelZoom(true);
    const marker = new BMap.Marker(point);  // 创建标注
    map.addOverlay(marker);              // 将标注添加到地图中
    const opts = {
      width: 200,     // 信息窗口宽度
      height: 100,     // 信息窗口高度
      title: "哈哈哈哈哈哈哈哈", // 信息窗口标题
      enableMessage: false,//设置不允许信息窗发送短息
    };
    const infoWindow = new BMap.InfoWindow("地址：" + 2 + "<br>" + "当前租赁点内自行车数量：" + 1, opts);  // 创建信息窗口对象
    marker.addEventListener("click", function () {
      map.openInfoWindow(infoWindow, point); //开启信息窗口
    });
    //获取当前位置经纬度（但是有很大偏差）
    const locatoin = new BMap.Geolocation();
    locatoin.getCurrentPosition(function (r) {
      var mk = new BMap.Marker(r.point);
      map.addOverlay(mk);
      map.panTo(r.point);
      alert('您的位置：' + r.point.lng + ',' + r.point.lat);
    });
  }
}
