package com.touchmusic.services.app.model;

public class City extends BaseEntity{
	
	private Country country = new Country();
	
	public City(){}
	
	public City(long id, String name, Country country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}

}
