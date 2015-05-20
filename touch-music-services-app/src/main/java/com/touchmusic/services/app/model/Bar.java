package com.touchmusic.services.app.model;

public class Bar {
	
	private long id;
	private String name;
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

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	
}
