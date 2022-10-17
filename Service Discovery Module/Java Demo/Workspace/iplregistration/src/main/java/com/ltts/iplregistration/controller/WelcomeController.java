package com.ltts.iplregistration.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.iplregistration.model.Player;
import com.ltts.iplregistration.repo.PlayerRepo;

@RestController

public class WelcomeController {

	@Autowired
	PlayerRepo pr;
	
	@RequestMapping("hii")
	public String m1()
	{
		return "Hello Welcome";
	}
	

	@RequestMapping("")
	public ModelAndView m2()
	{
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("register")
	
	public ModelAndView m3()
	{
		return new ModelAndView("register");
	}
	
	@RequestMapping("insertplayer")
	public String m5()
	{
		return "You are Welcome";
	}
	
	
	@RequestMapping(value="insertplayer", method=RequestMethod.POST)
	public ModelAndView m4(HttpServletRequest req)
	{
		ModelAndView mv =null;
		
		int player_id = (int) Math.floor(1000 + Math.random() * 9000);
		String player_name = req.getParameter("pname");
		String player_email = req.getParameter("pemail");
		String player_password  = req.getParameter("password");
		String player_team  = req.getParameter("pteam");
		System.out.println(player_name + " "+ player_id + " "+ player_password + " " +player_team);
		Player p = new Player(player_name,player_id,player_password,player_team,player_email);
		pr.save(p);
		return mv;
		}
	 
}
