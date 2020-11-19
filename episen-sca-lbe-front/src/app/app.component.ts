import {Component} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {ApiService} from './services/ApiService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  order: string;
  orderReturned: string;

  constructor(private router: Router, private route: ActivatedRoute, private  apiService: ApiService) {

  }

  sendOrder(): void {
    this.apiService.sentOrder(this.order);
  }
}
