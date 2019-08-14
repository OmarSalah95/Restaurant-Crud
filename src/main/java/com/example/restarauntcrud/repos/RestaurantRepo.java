package com.example.restarauntcrud.repos;

import com.example.restarauntcrud.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepo extends CrudRepository<Restaurant, Long>
{
}
