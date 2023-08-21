package com.demo.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.exception.EmployeeException;
import com.demo.model.EmployeeRequest;
import com.demo.model.EmployeeResponse;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/register")
	public ResponseEntity<EmployeeResponse> registerEmployee(@RequestBody EmployeeRequest employeeRequest) throws EmployeeException {
		
		EmployeeResponse res = employeeService.registerEmployee(employeeRequest);
		
		return new ResponseEntity<EmployeeResponse>(res,HttpStatus.CREATED);
	}

}
