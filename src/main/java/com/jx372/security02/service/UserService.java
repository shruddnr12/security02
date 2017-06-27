package com.jx372.security02.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.jx372.security02.vo.UserVo;

@Service
public class UserService {

	@PreAuthorize("#vo.user_name == authentication.name or hasRole('ROLE_ADMIN')")
	public void getUser(UserVo vo) {
		System.out.println("유저 이름="+vo.getUser_name());
		System.out.println("여기를 탄당");

	}

}
