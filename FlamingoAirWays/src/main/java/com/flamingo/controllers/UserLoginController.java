package com.flamingo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.entities.UserLogin;
import com.flamingo.services.UserServicesImpl;

@RestController
public class UserLoginController {
	@Autowired
	private UserServicesImpl userServices;

	@PostMapping("/user/{id}")
	public UserLogin findUserById(int profileId) {
		return userServices.findUserById(profileId);
	}

	@PostMapping("/user/add")
	public String add(UserLogin user) {
		userServices.addUser(user);
		return "new user is added : " + user.getId();

	}

	@PostMapping("/user/update")
	public String update(UserLogin user) {
		if (userServices.findUserById(user.getId()) != null) {
			userServices.updateUser(user);

			return "user updated successfuly :" + user.getId();
		} else {
			return "sorry user not found!";
		}
	}

}
