package com.demo.model;

import lombok.Data;

@Data
public class UserRequest {
	private Integer id;
	private String name;
	private Integer age;
	private String mobile;
	private String password;
	private Integer salary;
	private String address;
}
