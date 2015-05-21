package com.touchmusic.services.app.model;

import java.util.ArrayList;
import java.util.List;

public class Album extends BaseEntity{

	private String description;
	private List<Song> songs = new ArrayList<>();
	private byte[] image;
	
	public Album(){}
	
	public Album(long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
		
}
