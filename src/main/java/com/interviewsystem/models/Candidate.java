package com.interviewsystem.models;

public class Candidate {
	
	private int cid;
	private String name;
	private int expYears;
	private String priority;

	public int getIid() {
		return cid;
	}

	public void setIid(int iid) {
		this.cid = iid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getExpYears() {
		return expYears;
	}

	public void setExpYears(int expYears) {
		this.expYears = expYears;
	}
}
