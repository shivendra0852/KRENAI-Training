package com.demo.module;

import com.demo.entity.User;
import com.demo.model.UserResponse;

public class UserResponseMapper {
	public UserResponse map(User user) {
		
		UserResponse userResponse = new UserResponse();

		userResponse.setId(user.getId());
		userResponse.setName(user.getName());
		userResponse.setAge(user.getAge());
		userResponse.setMobile(user.getMobile());
		userResponse.setPassword(user.getPassword());
		userResponse.setSalary(user.getSalary());
		userResponse.setAddress(user.getAddress());

		return userResponse;

	}
}
