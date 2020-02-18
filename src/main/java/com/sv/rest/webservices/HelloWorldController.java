package com.sv.rest.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path="/helloworld")
	@ResponseBody
	public String helloworld(){
		return "hello world";
	}
	
	@GetMapping(path="/helloworld")
	@ResponseBody
	public String helloworld1(){
		String s;
		//comment to check
		return "***hello world";
	}
}

