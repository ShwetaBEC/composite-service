package com.purpose.financial.compositeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class NoAuthenticationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoAuthenticationException(String message) {
		super(message);
	}

	public NoAuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}
}
