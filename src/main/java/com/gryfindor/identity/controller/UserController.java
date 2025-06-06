package com.gryfindor.identity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gryfindor.identity.controller.request.UserRequest;
import com.gryfindor.identity.controller.response.UserResponse;
import com.gryfindor.identity.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UserResponse createDrone(@RequestBody UserRequest userRequest) {
		UserResponse registeredUser = userService.registerUser(userRequest);
		log.info("user is created with email [ {} ]", registeredUser.getEmai());
		return registeredUser;
	}

}
