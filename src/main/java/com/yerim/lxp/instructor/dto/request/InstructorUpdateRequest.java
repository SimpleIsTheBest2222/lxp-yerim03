package com.yerim.lxp.instructor.dto.request;

public class InstructorUpdateRequest {
	private Long id;
	private String name;
	private String introduction;

	public InstructorUpdateRequest(Long id, String name, String introduction) {
		this.id = id;
		this.name = name;
		this.introduction = introduction;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getIntroduction() {
		return introduction;
	}
}
