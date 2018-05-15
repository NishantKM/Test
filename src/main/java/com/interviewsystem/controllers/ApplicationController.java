package com.interviewsystem.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interviewsystem.dao.InterviewerDaoService;
import com.interviewsystem.models.Interviewer;

@RestController
public class ApplicationController {

	@Autowired
	private InterviewerDaoService interviewerService; 
	// Interviewer CRUD
	@RequestMapping(method = RequestMethod.POST,value= "/interviewer")
	public Interviewer createInterviewer(@RequestBody Interviewer interviewer){
		
		//System.out.println(interviewer);		
		return interviewerService.createInterviewer(interviewer);
		
	}
	@RequestMapping(method = RequestMethod.GET,value= "/interviewer/")
	public List<Interviewer> readAllInterviewer(){
		
		return interviewerService.getAll();
		
	}
	@RequestMapping(method = RequestMethod.GET,value= "/interviewer/{iid}")
	public Interviewer readInterviewer(@PathVariable int iid){
		
		//System.out.println(iid);
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
