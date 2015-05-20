package com.touchmusic.services.app.exception;

public class TouchMusicServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8478696995111715493L;
	
	
	public TouchMusicServiceException(String message) {
        super(message);
    }

    public TouchMusicServiceException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
