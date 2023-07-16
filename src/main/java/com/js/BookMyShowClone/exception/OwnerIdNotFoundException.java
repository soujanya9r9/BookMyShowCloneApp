package com.js.BookMyShowClone.exception;

public class OwnerIdNotFoundException extends RuntimeException{

	private String message;
	
	public String getMessage() {
		return message;
	}

	public OwnerIdNotFoundException(String message) {
		super();
		this.message = message;
	}
}