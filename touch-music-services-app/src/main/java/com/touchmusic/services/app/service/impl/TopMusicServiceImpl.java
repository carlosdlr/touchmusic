package com.touchmusic.services.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.touchmusic.services.app.exception.TouchMusicServiceException;
import com.touchmusic.services.app.model.Song;
import com.touchmusic.services.app.service.TopMusicService;

@Service
public class TopMusicServiceImpl implements TopMusicService{

	@Override
	public List<Song> getTopMusic(long barId) throws TouchMusicServiceException {
		
		return new ArrayList<>();
	}

}
