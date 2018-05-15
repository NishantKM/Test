package com.interviewsystem.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interviewsystem.models.Interviewer;

@RestController
public class ApplicationController {

	
	// Interviewer CRUD
	@RequestMapping(method = RequestMethod.POST,value= "/interviewer")
	public Interviewer createInterviewer(@RequestBody Interviewer interviewer){
		
		System.out.println(interviewer);
		return interviewer;
		
	}
	@RequestMapping(method = RequestMethod.GET,value= "/interviewer/{iid}")
	public Interviewer readInterviewer(@PathVariable int iid){
		
		System.out.println(iid);
		return new Interviewer(1, "name", "priority");
		
	}
	@RequestMapping(method = RequestMethod.PUT,value= "/interviewer")
	public Interviewer updateInterviewer(@RequestBody Interviewer interviewer){
		
		System.out.println(interviewer);
		return interviewer;
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value= "/interviewer")
	public Interviewer deleteInterviewer(@RequestBody Interviewer interviewer){
		
		System.out.println(interviewer);
		return interviewer;
		
	}
	
	
	// Candidate CRUD
	// Scheduler 
	
}
