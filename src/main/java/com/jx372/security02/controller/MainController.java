package com.jx372.security02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jx372.security02.service.UserService;
import com.jx372.security02.vo.UserVo;

@Controller
public class MainController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model,@RequestParam(value="user", defaultValue="", required=true) String user){
		
		UserVo vo= new UserVo(); 
		vo.setUser_name(user); 
		userservice.getUser(vo);
		System.out.println("==============================");
		
		return "main/index";
	}
}
