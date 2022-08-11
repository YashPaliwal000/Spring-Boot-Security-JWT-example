package com.jwtexample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwtexample.json.ResponseEntityJson;

@RestController
@CrossOrigin()
public class HelloWorldController {

	
	@GetMapping(value = "/hello", produces = { "application/json" })
	public @ResponseBody ResponseEntityJson getProductDetails(){
		ResponseEntityJson response=new ResponseEntityJson();
		response.setStatus("Success");
		return response;
	}

}
