package com.ltts.iplregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Player {
	
	@Id
	private int Pid;
    private String name;
    private String Password;
    private String Team;
	private String Email;
    
    
    
	public Player() {
		super();
	}
	public Player(String name,int pid, String password, String team ,String email) {
		super();
		this.Pid = pid;
		this.name = name;
		this.Password = password;
		this.Team = team;
		this.Email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	
	public int getPid()
	{
		return Pid;
	}
	
	
	public void setPid(int pid)
	{
		Pid=pid;
	}
	public void setAge(String age) {
		Password = age;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return "Player name=" + name + ", Age=" + Password + ", Team=" + Team + " , Email"+Email;
	}
}
