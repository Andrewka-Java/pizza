import {Component} from '@angular/core';
import {UserService} from './service/user-service.service';
import {User} from './model/User';
import {Role} from './model/Role';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';

  id: string;
  name: string;
  role: Role;
  email: string;
  cash: number;
  password: string;
  // passwordRepeat: string;

  constructor(private userService: UserService) {

  }

  registerUser(user: User) {
    user.role = Role.USER;
    this.userService.registerUser(user);
  }


}
