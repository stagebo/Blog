package com.blog.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "Blog")
public class BlogController {

	@RequestMapping(value = "GetBlogPage")
	public ModelAndView getBlogPage(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("UserInterface/Blog/Blog");
		return mav;

	}
	
	@RequestMapping(value = "getTest")
	public ModelAndView getTest(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mav = new ModelAndView();

		mav.setViewName("1");
		return mav;

	}
	
	
}
