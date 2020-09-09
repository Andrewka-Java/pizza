import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {User} from '../../model/User';


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};


@Injectable({
  providedIn: 'root'
})
export class UserService {

  private USER_ADD = 'http://localhost:8088/api/users/';

  constructor(private http: HttpClient) {

  }

  registerUser(user: User) {
    console.log(user);
    this.http.post(this.USER_ADD, user, httpOptions).subscribe();
  }

}
