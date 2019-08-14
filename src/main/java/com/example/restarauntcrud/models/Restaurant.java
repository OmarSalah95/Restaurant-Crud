package com.example.restarauntcrud.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "restaurants")
public class Restaurant
{
//	One to Many Relationship
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long restaurantId;

	@Column(unique = true, nullable = false)
	private String name;
	private String address;
	private String city;
	private String state;
	private String telephone;

	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("restaurant")
	private List<Menu> menus = new ArrayList<Menu>();

	public Restaurant()
	{
	}

	public Restaurant(String name, String address, String city, String state, String telephone)
	{
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.telephone = telephone;
	}

	public long getRestaurantId()
	{
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId)
	{
		this.restaurantId = restaurantId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getTelepnone()
	{
		return telephone;
	}

	public void setTelepnone(String telepnone)
	{
		this.telephone = telepnone;
	}

	public List<Menu> getMenus()
	{
		return menus;
	}

	public void setMenus(List<Menu> menus)
	{
		this.menus = menus;
	}
}
