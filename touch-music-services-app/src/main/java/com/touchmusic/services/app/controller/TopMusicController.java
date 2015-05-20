package com.touchmusic.services.app.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.touchmusic.services.app.exception.TouchMusicServiceException;
import com.touchmusic.services.app.model.Song;
import com.touchmusic.services.app.service.TopMusicService;


@RestController
public class TopMusicController {

	@Autowired
	private TopMusicService topMusicService;

	private final Logger LOGGER = Logger.getLogger(TopMusicController.class);


	@RequestMapping(value="/topMusic",method=RequestMethod.GET)
	public List<Song> topMusic(@RequestParam(value="barId") long barId){
		List<Song> songs = null;
		try {
			songs = topMusicService.getTopMusic(barId);
		} catch (TouchMusicServiceException e) {
			LOGGER.error("Error on TopMusicService",e);
		}
		return songs;
	}

}
