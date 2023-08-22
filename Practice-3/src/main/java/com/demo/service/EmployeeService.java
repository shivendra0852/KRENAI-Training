package com.demo.service;

import com.demo.exception.EmployeeException;
import com.demo.model.Employee;

public interface EmployeeService {
	public Employee registerEmployee(Employee employee) throws EmployeeException;
	
}
