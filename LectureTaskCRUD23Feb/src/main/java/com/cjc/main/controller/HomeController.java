package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.servicei.HomeServiceI;

@Controller
public class HomeController {
	
	@Autowired
	HomeServiceI hsi;
	
	@RequestMapping(value="/")
	public String preLogin()
	{
		System.out.println("open login page");
		return "login";
	}
	@RequestMapping(value="/registerPage")
	public String preRegister()
	{
		System.out.println("open register page");
		return "register";
	}
	@RequestMapping(value="/save")
	public String saveUser(@ModelAttribute Student s)
	{
		System.out.println("in controller");
		hsi.saveuser(s);
		System.out.println("end controller");
		return "login";
	}
	
	
}
