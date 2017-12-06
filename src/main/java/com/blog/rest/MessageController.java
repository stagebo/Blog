package com.blog.rest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.blog.dao.TMessageDAO;
import com.blog.dao.TUserDAO;
import com.blog.po.TMessage;


@Controller
@RequestMapping(value = "Message")
public class MessageController {

	@Resource(name="TMessageDAO")
	private TMessageDAO tMessageDao;
	
	@RequestMapping(value = "getMessagePage")
	public ModelAndView getMessagePage(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("UserInterface/Message/MessageBoard");
		return mav;

	}
	@ResponseBody
	@RequestMapping(value = "addTest")
	public String addTest(){
		TMessage tm = new TMessage();
		tm.setFId(UUID.randomUUID().toString());
		tm.setFCreatetime(Timestamp.valueOf("2017-12-6 9:24:09"));
		tm.setFLastmodifytime(Timestamp.valueOf("2017-12-6 9:24:09"));
		tm.setFOwnerid("123");
		tm.setFOwnertype(1);
		tMessageDao.save(tm);
		return "success";
	}
}
