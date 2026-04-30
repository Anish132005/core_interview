package com.rays.exception;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("User Not Found");
	}
}