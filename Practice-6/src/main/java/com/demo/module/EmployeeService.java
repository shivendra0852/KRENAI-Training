package com.demo.module;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Academic;
import com.demo.entity.Address;
import com.demo.entity.Employee;
import com.demo.entity.Experience;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AcademicRepository academicRepository;
	
	@Autowired
	private ExperienceRepository experienceRepository;
	
	public Employee registerEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Address registerAddress(Integer id, Address address) {
		address.setEmployee(employeeRepository.findById(id).get());
		return addressRepository.save(address);
	}
	
	public Academic registerAcademic(Integer id, Academic academic) {
		academic.setEmployee(employeeRepository.findById(id).get());
		return academicRepository.save(academic);
	}
	
	public Experience registerExperience(Integer id, Experience experience) {
		experience.setEmployee(employeeRepository.findById(id).get());
		return experienceRepository.save(experience);
	}
	
	public List<Address> getAddressByDetails(String city, String state, String pincode, Double salary){
		return addressRepository.findByCityAndStateAndPincodeAndEmployee_Salary(city, state, pincode, salary);
	}
	
	public List<Employee> getEmployeeByDetails(Integer age, Double salary, Date joiningDate){
		return employeeRepository.findByAgeAndSalaryAndJoiningDateBefore(age, salary, joiningDate);
	}
}
