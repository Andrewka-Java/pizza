import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Pizza} from '../../model/Pizza';

@Injectable({
  providedIn: 'root'
})
export class PizzaService {

    private PIZZAS = 'http://localhost:8088/api/pizzas/';

  constructor(private http: HttpClient) {

  }

  findAll(): Observable<Pizza[]> {
    return this.http.get<Pizza[]>(this.PIZZAS);
  }
}
