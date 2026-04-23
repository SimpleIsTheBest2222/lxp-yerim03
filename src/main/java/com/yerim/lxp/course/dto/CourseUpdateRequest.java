package com.yerim.lxp.course.dto;

import com.yerim.lxp.course.domain.CourseLevel;

public class CourseUpdateRequest {
	private String title;
	private String description;
	private Long price;
	private CourseLevel level;

	public CourseUpdateRequest(String title, String description, Long price, CourseLevel level, Long instructorId) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.level = level;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Long getPrice() {
		return price;
	}

	public CourseLevel getLevel() {
		return level;
	}
}
