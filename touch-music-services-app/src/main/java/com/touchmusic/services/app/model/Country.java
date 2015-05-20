package com.touchmusic.services.app.model;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	private long id;
	private String name;
	private List<City> cities = new ArrayList<>();
	
	public Country() {}
	
	public Country(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
