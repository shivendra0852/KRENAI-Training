package com.demo.model;

import com.demo.entity.Address;

public class AddressMapper {
	public Address map(AddressRequest request) {
		Address address = new Address();
		address.setId(request.getId());
		address.setCity(request.getCity());
		address.setPincode(request.getPincode());
		address.setState(request.getState());
		address.setEmployee(request.getEmployee());
		
		return address;
	}
}
