package com.demo.model;

import lombok.Data;

@Data
public class EmployeeRequest {
	private Integer id;
	private String name;
	private String mobile;
	private String password;
}
