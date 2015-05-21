package com.touchmusic.services.app.model;

public class Bar extends BaseEntity{
	
	private String address;
	private Country country = new Country();
	private City city = new City();
	
	public Bar(long id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
	
}
