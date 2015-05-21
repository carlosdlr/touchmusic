package com.touchmusic.services.app.model;

import java.util.ArrayList;
import java.util.List;

public class Country extends BaseEntity{

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
	
}
