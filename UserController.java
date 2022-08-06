package com.springrest.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.UserEntity;
import com.springrest.springrest.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/home")
	public List home() {
		List list = new ArrayList<>();
		list.add("Home is back");
		return list;
	}

	@GetMapping("/call")
	public String second() {
		return "This is a string";
	}

	@PostMapping("/")
	public UserEntity createUser(@RequestBody UserEntity user) throws Exception {
		return this.userService.createUser(user);
	}

	@GetMapping("/{email}")
	public UserEntity getUser(@PathVariable("email") String email) throws Exception {

		return this.userService.getUser(email);

	}
}
