package com.demo.model;

import com.demo.entity.Employee;

public class EmployeeMapper {
	public Employee map(EmployeeRequest request) {
		Employee employee = new Employee();
		employee.setId(request.getId());
		employee.setName(request.getName());
		employee.setAge(request.getAge());
		employee.setPhone(request.getPhone());
		employee.setSalary(request.getSalary());
		employee.setJoiningDate(request.getJoiningDate());
		
		return employee;
	}
}
