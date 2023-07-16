package com.js.BookMyShowClone.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.js.BookMyShowClone.util.ResponseStructure;

@RestControllerAdvice
public class BookMyShowExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> ownerIdNotFound(OwnerIdNotFoundException ex){
		
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setMessage("Id Not found for Owner");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(ex.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> houseIdNotFound(ProductionHouseIdNotFoundException ex){
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setMessage("Id Not Found for ProductionHouse");
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData(ex.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
}

