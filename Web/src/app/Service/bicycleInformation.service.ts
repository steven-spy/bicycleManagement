import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";


@Injectable()
export class BicycleInformationService {

  constructor(
    private http: HttpClient
  ) {
  }

  getBicycleCount() {
    return this.http.get('/Bicycle/getBicycleCount');
  }

  getAllWithPaging(pageSize: number, pageCount: number) {
    return this.http.get('/Bicycle/getAllWithPaging?pageSize=' + pageSize + '&pageCount=' + pageCount);
  }

  getAllWithCondition() {
    return this.http.get('/Bicycle/getAllWithCondition');
  }

  searchBicycleByName(inputValue: any) {
    return this.http.get('/Bicycle/searchBicycleByName?biName=' + inputValue);
  }

  repairBicycle(data: any) {
    return this.http.get('/Bicycle/repairBicycle?biId=' + data);
  }

  deleteBicycleById(data: any) {
    return this.http.get('/Bicycle/deleteBicycleById?biId=' + data);
  }
}
