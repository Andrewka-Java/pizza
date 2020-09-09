import { Component, OnInit } from '@angular/core';
import {PizzaService} from '../../services/pizza/pizza.service';
import {Pizza} from '../../model/Pizza';

@Component({
  selector: 'app-pizzas',
  templateUrl: './pizzas.component.html',
  styleUrls: ['./pizzas.component.css']
})
export class PizzasComponent implements OnInit {

  pizzas: Pizza[];

  constructor(private pizzaService: PizzaService) {

  }

  ngOnInit(): void {
    this.pizzaService.findAll()
        .subscribe(pizzas => this.pizzas = pizzas)
  }

}
