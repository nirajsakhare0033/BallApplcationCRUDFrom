package com.example.ballapp.service;

import java.util.List;

import com.example.ballapp.model.ball;
import com.example.ballapp.model.specificData;

public interface myService {

	public void addBallInDatabase(ball balls);

	public List<specificData> getData();

}
