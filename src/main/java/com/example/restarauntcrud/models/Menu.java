package com.example.restarauntcrud.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "menus")
public class Menu
{
//	Many To one Relationship
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long menuId;

	@Column(nullable = false)
	private String dish;
	private double price;

	@ManyToOne
	@JoinColumn(name = "restaurantId", nullable = false)
	@JsonIgnoreProperties("menu")
	private Restaurant restaurant;

	public Menu()
	{
	}

	public Menu(String dish, double price, Restaurant restaurant)
	{
		this.dish = dish;
		this.price = price;
		this.restaurant = restaurant;
	}

	public long getMenuId()
	{
		return menuId;
	}

	public void setMenuId(long menuId)
	{
		this.menuId = menuId;
	}

	public String getDish()
	{
		return dish;
	}

	public void setDish(String dish)
	{
		this.dish = dish;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public Restaurant getRestaurant()
	{
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant)
	{
		this.restaurant = restaurant;
	}
}
