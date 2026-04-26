package com.yerim.lxp.instructor.dto.request;

public class InstructorCreateRequest {
	private String name;
	private String introduction;

	public InstructorCreateRequest(String name, String introduction) {
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
