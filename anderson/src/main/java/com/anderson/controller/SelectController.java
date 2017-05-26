package com.anderson.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anderson.entity.Users;
import com.anderson.service.UsersService;  

@Controller  
@RequestMapping("/select") 
public class SelectController {
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/doSelect") //url
	public String doSelect(Users users, Model model,HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println(users.getUid());
		try {
			Users u = usersService.selectByPrimaryKey(users.getUid());
			System.out.println("µÇÂ¼Ãû£º"+u.getUloginname()+"		ÃÜ  Âë"+u.getUpassword());
			request.setAttribute("name", u.getUloginname());
			request.setAttribute("pass", u.getUpassword());
		} catch (Exception e) {
			model.addAttribute("failMsg", "Erro!!!");
			System.out.println(e);
			
			return "/fail"; 
		}
		model.addAttribute("successMsg", "Success!!!");
		
		return "/success";
	}
}
