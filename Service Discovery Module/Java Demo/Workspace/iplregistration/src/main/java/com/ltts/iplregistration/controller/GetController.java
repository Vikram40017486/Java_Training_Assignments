package com.ltts.iplregistration.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.iplregistration.model.Player;
import com.ltts.iplregistration.repo.PlayerRepo;

@RestController
public class GetController {
     
	@Autowired
	PlayerRepo pr;
	
	
	@GetMapping("/players")
	public List<Player> getAllPlayer()
	{
		return pr.findAll();
	}
	
	@GetMapping("/players/{id}")
	public Player getAllPlayerById(@PathVariable int id)
	{
		return pr.findById(id).get();
	}
	
}
