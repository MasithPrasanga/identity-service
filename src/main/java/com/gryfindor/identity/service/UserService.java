package com.gryfindor.identity.service;

import com.gryfindor.identity.controller.request.UserRequest;
import com.gryfindor.identity.controller.response.UserResponse;

public interface UserService {

	UserResponse registerUser(UserRequest userRequest);

}
