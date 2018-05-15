package com.interviewsystem.models;

public class Interviewer {

	private int iid;
	private String name;
	private String priority;

	@Override
	public String toString() {
		return "Interviewer [iid=" + iid + ", name=" + name + ", priority=" + priority + "]";
	}

	public Interviewer(int iid, String name, String priority) {
		super();
		this.iid = iid;
		this.name = name;
		this.priority = priority;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
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

}
