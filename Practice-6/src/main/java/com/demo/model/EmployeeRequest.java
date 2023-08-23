package com.demo.model;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeRequest {
	private Integer id;
	private String name;
	private Integer age;
	private String phone;
	private Double salary;
	private Date joiningDate;
}
