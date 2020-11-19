import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) {

  }

  sentOrder(order: string): void {
    // tslint:disable-next-line:only-arrow-functions typedef
    this.http.post<any>(`add/order`, order).subscribe(function(data) {
      console.log(data);
    });
  }

}
