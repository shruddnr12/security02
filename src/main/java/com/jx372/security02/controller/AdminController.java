package com.jx372.security02.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping({"","/"})
	public String admin(){
		return "admin/admin";
	}
}
