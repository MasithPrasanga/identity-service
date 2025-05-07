package com.gryfindor.identity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.gryfindor.identity.controller.request.UserRequest;
import com.gryfindor.identity.controller.response.UserResponse;
import com.gryfindor.identity.exception.UserFoundException;
import com.gryfindor.identity.model.User;
import com.gryfindor.identity.repository.UserRepository;
import com.gryfindor.identity.util.ExceptionName;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserResponse registerUser(UserRequest userRequest) {
		User existingUser = userRepository.findByEmail(userRequest.getEmai());
		if (!ObjectUtils.isEmpty(existingUser)) {
			String description = String.format("user is availabe for [ %s ] email address", userRequest.getEmai());
			throw new UserFoundException(ExceptionName.USER_FOUND.getExceptionName(), description);
		}

		User user = Transformer.createUser(userRequest);
		User registeredUser = userRepository.save(user);
		return Transformer.createUserResponse(registeredUser);
	}

}
