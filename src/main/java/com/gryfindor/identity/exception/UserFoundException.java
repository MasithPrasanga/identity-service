package com.gryfindor.identity.exception;

import org.springframework.http.HttpStatus;

public class UserFoundException extends IdentityException {

	private static final long serialVersionUID = 1L;

	public UserFoundException() {
		super();
	}

	public UserFoundException(String exceptionName, String description) {
		super(exceptionName, description, HttpStatus.BAD_REQUEST);
	}

}
