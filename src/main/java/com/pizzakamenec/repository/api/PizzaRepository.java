package com.pizzakamenec.repository.api;

import com.pizzakamenec.model.Pizza;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository {

    List<Pizza> findAll();
    Pizza findById(Pizza pizza);
    Pizza findByTitle(String title);
    List<Pizza> searchByCost(Double beginPrice, Double endPrice);
    void save(Pizza pizza);
    void update(Pizza pizza);
    void deleteById(String id);

}
