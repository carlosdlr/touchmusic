package com.touchmusic.services.app.model;

import java.util.ArrayList;
import java.util.List;

public class Artist extends BaseEntity{
	
	private String shortBio;
	private List<Album> albums = new ArrayList<>();
	
	public Artist(){}
	
	public Artist(long id, String name, String shortBio) {
		this.id = id;
		this.name = name;
		this.shortBio = shortBio;
	}

	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}

	public String getShortBio() {
		return shortBio;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
}
