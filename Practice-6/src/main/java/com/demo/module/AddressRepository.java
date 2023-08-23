package com.demo.module;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	public List<Address> findByCityAndStateAndPincodeAndEmployee_Salary(String city, String state, String pincode, Double salary);
}
