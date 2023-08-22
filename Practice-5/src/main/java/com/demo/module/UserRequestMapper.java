package com.demo.module;

import com.demo.entity.User;
import com.demo.model.UserRequest;

public class UserRequestMapper {
	
	public User map(UserRequest userRequest) {
		
		User user = new User();
		
		user.setId(userRequest.getId());
		user.setName(user.getName());
		user.setAge(userRequest.getAge());
		user.setMobile(userRequest.getMobile());
		user.setPassword(userRequest.getPassword());
		user.setSalary(userRequest.getSalary());
		user.setAddress(userRequest.getAddress());
		
		return user;
		
	}

}
