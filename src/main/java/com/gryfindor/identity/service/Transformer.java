package com.gryfindor.identity.service;

import com.gryfindor.identity.controller.request.UserRequest;
import com.gryfindor.identity.controller.response.UserResponse;
import com.gryfindor.identity.model.User;

public interface Transformer {

	public static User createUser(UserRequest userRequest) {
		return User.builder()
				.username(userRequest.getUserName())
				.email(userRequest.getEmai())
				.password(userRequest.getPassword())
				.enabled(false)
				.build();
	}

	public static UserResponse createUserResponse(User registeredUser) {
		return UserResponse.builder()
				.userName(registeredUser.getUsername())
				.emai(registeredUser.getEmail())
				.password(registeredUser.getPassword())
				.build();
	}
	
}
