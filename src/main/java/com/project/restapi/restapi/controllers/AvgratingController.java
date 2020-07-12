package com.project.restapi.restapi.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.restapi.restapi.service.*;
import com.project.restapi.restapi.models.*;

@RestController
public class AvgratingController {
	
	@Autowired
    private AvgratingService avgratingService;
    
    @RequestMapping("/")
	public String home(){
		return "Hello";
	}

	@RequestMapping("/ratings")
	public List<Avgrating> getAllRatings(){
		return avgratingService.getAllRatings();
	}

	@RequestMapping("/rating/{email}")
	public Optional<Avgrating> getRatingForEmail(@PathVariable String email) {
		return avgratingService.getRatingForEmail(email);
	}

	@RequestMapping(method=RequestMethod.POST,value="/rating")
	public Avgrating insertRating(@RequestBody Avgrating avgrating) {
		System.out.print(avgrating);
		return avgratingService.insertRating(avgrating);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/rating/{email}")
	public void deleteRating(@PathVariable String email){
		avgratingService.deleteRating(email);
	}
}