package com.bank.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionClass {
	
	@ExceptionHandler(IndexOutOfBoundsException.class)
	public ResponseEntity<Map<String, String>> indexOutOfBoundsException(IndexOutOfBoundsException ex){
		
		Map<String,String> hm=new HashMap<>();
		hm.put("Message :: ", ex.getMessage());
		hm.put("Status", "false");
		
		return new ResponseEntity<>(hm, HttpStatus.BAD_REQUEST);
		
	}

}
