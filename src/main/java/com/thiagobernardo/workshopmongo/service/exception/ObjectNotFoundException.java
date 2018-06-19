package com.thiagobernardo.workshopmongo.service.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -805002459523321920L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
