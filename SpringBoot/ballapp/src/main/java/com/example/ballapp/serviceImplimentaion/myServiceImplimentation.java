package com.example.ballapp.serviceImplimentaion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ballapp.model.ball;
import com.example.ballapp.model.specificData;
import com.example.ballapp.repository.ballRepo;
import com.example.ballapp.service.myService;


@Component
public class myServiceImplimentation implements myService{

	@Autowired
	ballRepo ballrepo;
	
	@Override
	public void addBallInDatabase(ball balls) {
		
		ballrepo.save(balls);
		
	}

	@Override
	public List<specificData> getData() {
		
		return ballrepo.getAllInformation();
	}

}
