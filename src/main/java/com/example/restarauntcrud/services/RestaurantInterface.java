package com.example.restarauntcrud.services;

import com.example.restarauntcrud.models.Restaurant;

import java.util.List;

public interface RestaurantInterface
{
	List<Restaurant> findAll();

	Restaurant findRestaurantById();

	Restaurant findRestaurantByName();

	void delete(long id);

	Restaurant create(Restaurant r);

	Restaurant update(Restaurant r, long id);
}
