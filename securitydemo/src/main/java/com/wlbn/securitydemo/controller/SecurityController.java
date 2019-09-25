package com.wlbn.securitydemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wlbn.securitydemo.model.User;

@RestController
public class SecurityController {

	@RequestMapping(name = "get_mapping", path = "user", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public User getUser() {
		return new User(1, "test", "pass");
	}
}
