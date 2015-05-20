package com.touchmusic.services.app.model;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private long id;
	private String name;
	private String description;
	private List<Song> songs = new ArrayList<>();
	
	public Album(){}
	
	public Album(long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
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
		
}
