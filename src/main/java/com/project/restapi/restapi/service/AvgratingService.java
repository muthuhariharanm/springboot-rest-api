package com.project.restapi.restapi.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restapi.restapi.models.*;

@Service
public class AvgratingService {
	@Autowired
	private AvgratingRepository avgratingRepository;
	
	public List<Avgrating> getAllRatings(){
		return avgratingRepository.findAll();
	}

	public Optional<Avgrating> getRatingForEmail(String email) {
		return avgratingRepository.findById(email);
	}

	public Avgrating insertRating(Avgrating avgrating) {
		return avgratingRepository.save(avgrating);
	}

	public Avgrating updateRating(Avgrating avgrating) {
		return avgratingRepository.save(avgrating);
	}

	public void deleteRating(String email) {
		avgratingRepository.deleteById(email);
	}
}