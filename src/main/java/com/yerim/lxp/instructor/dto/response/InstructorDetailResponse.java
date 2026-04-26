package com.yerim.lxp.instructor.dto.response;

public class InstructorDetailResponse {
	private Long id;
	private String name;
	private String introduction;

	public InstructorDetailResponse(Long id, String name, String introduction) {
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
