package com.example.restarauntcrud.controllers;

import com.example.restarauntcrud.models.Restaurant;
import com.example.restarauntcrud.services.RestaurantInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController
{
	@Autowired
	private RestaurantInterface rService;

	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<?> listAllRestaurants()
	{
		List<Restaurant> myRestaurants = rService.findAll();
		return new ResponseEntity<>(myRestaurants, HttpStatus.OK);
	}
}
