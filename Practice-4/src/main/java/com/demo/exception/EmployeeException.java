package com.demo.exception;

import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
public class EmployeeException extends RuntimeException{
	
	public EmployeeException(String message) {
		super(message);
	}
}
