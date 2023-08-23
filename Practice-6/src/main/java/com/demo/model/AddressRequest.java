package com.demo.model;

import com.demo.entity.Employee;

import lombok.Data;

@Data
public class AddressRequest {
	private Integer id;
	private String city;
	private String pincode;
	private String state;
	private Employee employee;
}
