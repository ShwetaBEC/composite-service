package com.purpose.financial.compositeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class NotPermittedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotPermittedException(String message) {
		super(message);
	}
	
	public NotPermittedException(String message, Throwable cause) {
		super(message, cause);
	}
}