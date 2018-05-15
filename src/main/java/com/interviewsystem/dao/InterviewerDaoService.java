package com.interviewsystem.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.interviewsystem.models.Interviewer;

@Component
public class InterviewerDaoService {

	
	private static List<Interviewer> interviewer = new ArrayList<>();
	private int count = 3;
	
	static {
		
		interviewer.add(new Interviewer(1, "Rakshit ", "P2"));
		interviewer.add(new Interviewer(2, "Poonam ", "P1"));
		interviewer.add(new Interviewer(1, "Nishant ", "P2"));
		
	}
	
	
	public List<Interviewer> getAll(){
		return interviewer;
	}
	
	
	public List<Interviewer> get(int iid){		
		return interviewer;
	}
	
	public Interviewer createInterviewer(Interviewer interviewer){
		this.interviewer.add(interviewer);
		return interviewer;
	}
	
	public Interviewer updateInterviewer(Interviewer interviewer){

		this.interviewer.add(interviewer);
		return interviewer;
	}
	
	
	public Interviewer deleteInterviewer(Interviewer interviewer){

		this.interviewer.add(interviewer);
		return interviewer;
	}
	
	
}
