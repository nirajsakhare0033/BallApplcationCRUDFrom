package com.example.ballapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ballapp.model.ball;
import com.example.ballapp.model.specificData;
import com.example.ballapp.service.myService;


@CrossOrigin(origins="*")
@RestController
public class MyController {
	
	
	@Autowired()
	myService service;
	
	@PostMapping("addBall")
	public void addBall(@RequestBody ball balls) {
		service.addBallInDatabase(balls);
	}
	
	@GetMapping("getData")
	public List <specificData> getData(){
		return service.getData();
	}
	
	
	

}
