package com.demo.module;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	public List<Employee> findByAgeAndSalaryAndJoiningDateBefore(Integer age, Double salary, Date joiningDate);
}
