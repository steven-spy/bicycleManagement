import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class LeasePointService {

  constructor(
    private http: HttpClient
  ) {
  }

  getLeasePoint() {
    return this.http.get('/LeasePoint/getAll');
  }

  searchLeasePointByName(data: any) {
    return this.http.get('/LeasePoint/searchLeasePointByName?lpName=' + data);
  }
}
