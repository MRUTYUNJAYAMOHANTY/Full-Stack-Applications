package com.java.angular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
// whenever a resource not exist in a database we can through this custom exception from API layer
public class ResourceNotFoundException extends RuntimeException{
	
  // RuntimeException internally implements serializable interface 
private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
