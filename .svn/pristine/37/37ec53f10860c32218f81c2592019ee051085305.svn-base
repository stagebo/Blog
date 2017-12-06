package com.blog.rest;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.dao.TUserDAO;
import com.blog.po.TUser;

@Controller
public class UserController {
	
	@Resource(name="TUserDAO")
	private TUserDAO tu;
	
	@RequestMapping(value="/test")
	public String add() {
		TUser u = new TUser();
		u.setFId(UUID.randomUUID().toString());
		u.setFAddr("123");
		u.setFName("23");
		u.setFPassword("123");
		u.setFUserlevel(5);
		tu.save(u);
		return "/index";
	}
}
