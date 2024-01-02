package com.example.demo.Exception;

public class EmployeeNotFoundException extends RuntimeException {

 public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

public EmployeeNotFoundException(Long id) {
     super("Employee not found with id: " + id);
 }
}
