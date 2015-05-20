package com.touchmusic.services.app.model;

import java.util.ArrayList;
import java.util.List;

public class Song {
	
	private final long id;
	private final String name;
	private List<Album> albums = new ArrayList<>();
	private Artist artist = new Artist();
	
	
	public Song(long id, String name, Artist artist) {
		this.id = id;
		this.name = name;
		this.artist = artist;
	}


	public List<Album> getAlbums() {
		return albums;
	}


	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}


	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Artist getArtist() {
		return artist;
	}


	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
}
