package com.jx372.security02.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@Secured("ROLE_USER")
	@RequestMapping({ "", "/" })
	public String user() {

		return "user/user";
	}
}
