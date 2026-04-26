package com.yerim.lxp.instructor.dto.response;

public class InstructorListResponse {
	private Long id;
	private String name;

	public InstructorListResponse(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
