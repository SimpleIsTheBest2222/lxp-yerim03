package com.yerim.lxp.instructor.dto;

public class InstructorRequest {
	private String name;
	private String introduction;

	public InstructorRequest(String name, String introudtion) {
		this.name = name;
		this.introduction = introudtion;
	}

	public String getName() {
		return name;
	}

	public String getIntroduction() {
		return introduction;
	}
}
