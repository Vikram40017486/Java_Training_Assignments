package com.ltts.anotherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController

public class GetController {

	
	 @Autowired
	 private LoadBalancerClient loadBalancerClient;
	
	
	
	@RequestMapping ("/")
	public String Page1()
	{
		return "Welcome to fetch Page";
	}
	
    @GetMapping("/playerlist")
    public Flux<String> getAllPlayer()
    {
         WebClient st = WebClient.create("http://localhost:8080");
         Flux<String> f1 = st.get().uri("/players").retrieve().bodyToFlux(String.class);
		 return f1;
    }
    
    public String getUrl()
    {
    	ServiceInstance instance  = loadBalancerClient.choose("PLAYERREGISTRATION");
    	return instance.getUri().toString();
    }
}
