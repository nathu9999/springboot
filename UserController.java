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
	}
	
	int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

	@GetMapping("/{email}")
	public UserEntity getUser(@PathVariable("email") String email) throws Exception {

		return this.userService.getUser(email);

	}
}
