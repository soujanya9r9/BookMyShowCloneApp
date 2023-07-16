package com.js.BookMyShowClone.exception;

public class ProductionHouseIdNotFoundException extends RuntimeException {

		public ProductionHouseIdNotFoundException(String message) {
			super();
			this.message = message;
		}
		private String message;
		
		public String getMessage() {
			return message;
		}
		
	}

