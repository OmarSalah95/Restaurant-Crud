package com.example.restarauntcrud.services;

import com.example.restarauntcrud.models.Restaurant;
import com.example.restarauntcrud.repos.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "rService")
public class RestaurantServiceImpl implements RestaurantInterface
{
	@Autowired
	private RestaurantRepo restRepo;

	@Override
	public List<Restaurant> findAll()
	{
		List<Restaurant> rList = new ArrayList<>();
		restRepo.findAll().iterator().forEachRemaining(rList::add);
		return rList;
	}

	@Override
	public Restaurant findRestaurantById()
	{
		return null;
	}

	@Override
	public Restaurant findRestaurantByName()
	{
		return null;
	}

	@Override
	public void delete(long id)
	{

	}

	@Override
	public Restaurant create(Restaurant r)
	{
		return null;
	}

	@Override
	public Restaurant update(Restaurant r, long id)
	{
		return null;
	}
}
