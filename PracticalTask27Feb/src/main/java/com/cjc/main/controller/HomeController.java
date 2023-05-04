package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.main.ServiceI.HomeServiceI;
import com.cjc.main.model.Books;
import com.cjc.main.model.User;

@Controller
public class HomeController {
	
	@Autowired
    HomeServiceI hs;
	
	@RequestMapping(value="/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping(value="/register")
	public String preregister()
	{
		return "register";
	}
	
	@RequestMapping(value="/save")
	public String saveUser(@ModelAttribute User u)
	{
		
		hs.saveUser(u);
		
		return "login";
	}
	
	@RequestMapping(value="/save")
	public String admin()
	{
		if("usertype".equals("Admin"))
		{
			return "admin";
		}
		else
		{
		return "login";
		}
	}	
	
	@RequestMapping(value="/admin")
	public String createUser()
	{
		return "admin";
	}
	@RequestMapping(value="/book")
	public String managebook()
	{
		return "book";
	}
	
	@RequestMapping(value="/bookregister")
	public String bookreg()
	{
		return "book";
	}
	
	@RequestMapping(value="/savebook")
	public String savebook(@ModelAttribute Books b)
	{
		hs.saveBook(b);
		return "book";
	}
	
	
	
	

}

