package com.example.restarauntcrud.models;

import javax.persistence.*;

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
	private String telepnone;
}
