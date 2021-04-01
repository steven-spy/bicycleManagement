import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";


@Injectable()
export class BicycleTrackService {

  constructor(
    private http: HttpClient
  ) {
  }

  getAll() {
    return this.http.get('/BicycleTrack/getAll');
  }

  getAppointBicycleTrack(data: any) {
    return this.http.get('/BicycleTrack/getAppointBicycleTrack?btBicycleName=' + data);
  }
}
