package com.example.demo.exception;

import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
public class AuthorizationException extends RuntimeException{
	
	public AuthorizationException(String message) {
		super(message);
	}
	
	

}
