import {Role} from './Role';

export class User {

    id: string;
    name:  string;
    email: string;
    password: string;
    private _role: Role;
    cash?: number;


    constructor(name: string, email: string, password: string, role: Role, cash?: number) {
        this.name = name;
        this.email = email;
        this.password = password;
        this._role = role;
        this.cash = cash;
    }


    set role(value: Role) {
        this._role = value;
    }
}
