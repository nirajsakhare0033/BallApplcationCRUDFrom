package com.example.ballapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ballapp.model.ball;
import com.example.ballapp.model.specificData;

@ResponseBody
public interface ballRepo extends JpaRepository<ball, Integer>{
	@Query(value = "select ball_color as BallColor, count(ball_color) as count " + "from ball group by ball_color", nativeQuery = true)
	List<specificData>getAllInformation();

}
