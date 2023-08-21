package com.demo.module;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employee;
import com.demo.exception.EmployeeException;
import com.demo.model.EmployeeRequest;
import com.demo.model.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeResponse registerEmployee(EmployeeRequest employeeRequest) throws EmployeeException{
		
		Optional<Employee> existingEmployee = employeeRepository.findById(employeeRequest.getId());
		
		if(existingEmployee.isPresent()) {
			throw new EmployeeException("Employee already registered with this details!");
		}
		
		Employee newEmployee = new Employee();
		newEmployee.setName(employeeRequest.getName());
		newEmployee.setMobile(employeeRequest.getMobile());
		newEmployee.setPassword(employeeRequest.getPassword());
		
		employeeRepository.save(newEmployee);
		
		
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setName(newEmployee.getName());
		employeeResponse.setMobile(newEmployee.getMobile());
		employeeResponse.setPassword(newEmployee.getPassword());
		
		
		
		return employeeResponse;
		
	}
	
}
