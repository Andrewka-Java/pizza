import { Component, OnInit } from '@angular/core';
import {Role} from '../../model/Role';
import {UserService} from '../../services/user-service.service';
import {User} from '../../model/User';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  id: string;
  name: string;
  role: Role;
  email: string;
  cash: number;
  password: string;
  // passwordRepeat: string;

  constructor(private userService: UserService) {

  }

  ngOnInit() {
  }

  registerUser(user: User) {
    user.role = Role.USER;
    this.userService.registerUser(user);
  }
}
