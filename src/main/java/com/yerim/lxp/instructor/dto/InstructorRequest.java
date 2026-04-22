package com.yerim.lxp.instructor.dto;

public class InstructorRequest {
	private String name;
	private String introduction;

	public InstructorRequest(String name, String introduction) {
		this.name = name;
		this.introduction = introduction;
	}

	public String getName() {
		return name;
	}

	public String getIntroduction() {
		return introduction;
	}
}
