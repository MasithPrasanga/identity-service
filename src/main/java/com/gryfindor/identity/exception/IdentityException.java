package com.gryfindor.identity.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class IdentityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errorCode;
	private String description;
	private HttpStatus httpStatusCode;

	public IdentityException() {
		super();
	}

	public IdentityException(String errorCode, String description, HttpStatus httpStatusCode) {
		super(description);
		this.errorCode = errorCode;
		this.description = description;
		this.httpStatusCode = httpStatusCode;
	}

}
