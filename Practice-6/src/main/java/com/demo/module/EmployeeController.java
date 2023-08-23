package com.demo.module;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Academic;
import com.demo.entity.Address;
import com.demo.entity.Employee;
import com.demo.entity.Experience;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees/register")
	public ResponseEntity<Employee> registerEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.registerEmployee(employee),HttpStatus.CREATED);
	}
	
	@PostMapping("/address/register")
	public ResponseEntity<Address> registerAddress(@RequestParam Integer id, @RequestBody Address address){
		return new ResponseEntity<Address>(employeeService.registerAddress(id,address),HttpStatus.CREATED);
	}
	
	@PostMapping("/academic/register")
	public ResponseEntity<Academic> registerAcademic(@RequestParam Integer id, @RequestBody Academic academic){
		return new ResponseEntity<Academic>(employeeService.registerAcademic(id,academic),HttpStatus.CREATED);
	}
	
	@PostMapping("/experience/register")
	public ResponseEntity<Experience> registerExperience(@RequestParam Integer id, @RequestBody Experience experience){
		return new ResponseEntity<Experience>(employeeService.registerExperience(id,experience),HttpStatus.CREATED);
	}
	
	@GetMapping("/getaddressbydetails")
	public ResponseEntity<List<Address>> getAddressByDetails(@RequestParam String city, @RequestParam String state, @RequestParam String pincode, @RequestParam Double salary){
		return new ResponseEntity<List<Address>>(employeeService.getAddressByDetails(city, state, pincode, salary),HttpStatus.OK);
	}
	
	@GetMapping("/getemployeebydetails")
	public ResponseEntity<List<Employee>> getEmployeeByDetails(@RequestParam Integer age, @RequestParam Double salary, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date joiningDate){
		return new ResponseEntity<List<Employee>>(employeeService.getEmployeeByDetails(age, salary, joiningDate),HttpStatus.OK);
	}
}
