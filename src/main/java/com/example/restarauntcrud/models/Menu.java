package com.example.restarauntcrud.models;

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
	private Restaurant restaurant;
}
