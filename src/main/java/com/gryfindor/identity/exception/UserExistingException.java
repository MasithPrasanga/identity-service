package com.gryfindor.identity.exception;

import org.springframework.http.HttpStatus;

public class UserExistingException extends IdentityException {

	private static final long serialVersionUID = 1L;

	public UserExistingException() {
		super();
	}

	public UserExistingException(String errorCode, String description, HttpStatus httpStatusCode) {
		super(errorCode, description, httpStatusCode);
	}

}
