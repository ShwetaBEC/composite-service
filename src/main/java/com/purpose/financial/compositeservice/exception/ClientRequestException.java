package com.purpose.financial.compositeservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ClientRequestException extends RuntimeException {

	private static final long serialVersionUID = -3818588426255262649L;

	public ClientRequestException() {
		super();
	}

	public ClientRequestException(String message) {
		super(message);
	}

	public ClientRequestException(String message, Throwable cause) {
		super(message, cause);
	}

}
