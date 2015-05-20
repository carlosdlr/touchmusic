package com.touchmusic.services.app.service;

import java.util.List;

import com.touchmusic.services.app.exception.TouchMusicServiceException;
import com.touchmusic.services.app.model.Song;

public interface TopMusicService {
	
	List<Song> getTopMusic(long barId) throws TouchMusicServiceException;

}
