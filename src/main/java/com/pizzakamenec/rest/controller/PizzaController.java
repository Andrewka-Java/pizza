package com.pizzakamenec.rest.controller;

import com.pizzakamenec.model.Pizza;
import com.pizzakamenec.repository.api.PizzaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizzas")
@AllArgsConstructor
@Api(value = "pizza resources", description = "Operations with pizza-entity")
public class PizzaController {


    private final PizzaRepository pizzaRepo;


    @ApiOperation(value = "Find all pizzas", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list of pizza"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping(value = "/", produces = "application/json")
    public List<Pizza> findAll() {
        return pizzaRepo.findAll();
    }



    @ApiOperation(value = "Find pizza by title", response = Pizza.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved a pizza"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping(value = "/{title}", produces = "application/json")
    public Pizza findPizzaByTitle(@PathVariable("title") String title) {
        return pizzaRepo.findByTitle(title);
    }



    @ApiOperation(value = "Find pizzas by price", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list of pizza by prices"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping(value = "/prices", produces = "application/json")
    public List<Pizza> searchPizzaByPrice(@RequestParam("beginPrice") Double beginPrice,
                                          @RequestParam("endPrice") Double endPrice) {
        return pizzaRepo.searchByCost(beginPrice, endPrice);
    }



    @ApiOperation(value = "Create pizza", response = void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully added pizza"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @PostMapping(value = "/")
    public void savePizza(@RequestBody Pizza pizza) {
        pizzaRepo.save(pizza);
    }



    @ApiOperation(value = "Update pizza by id", response = void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully updated pizza"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @PutMapping("/{pizzaId}")
    public void updatePizza(@RequestBody Pizza pizza, @PathVariable("pizzaId") String pizzaId) {
        pizza.setId(pizzaId);
        pizzaRepo.update(pizza);
    }



    @ApiOperation(value = "Delete pizza by id", response = void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully deleted pizza"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @DeleteMapping("/{pizzaId}")
    public void deletePizza(@PathVariable("pizzaId") String pizzaId) {
        pizzaRepo.deleteById(pizzaId);
    }



}
