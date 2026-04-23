package com.yerim.lxp.course.dto;

import java.time.LocalDateTime;

import com.yerim.lxp.course.domain.CourseLevel;

public class CourseResponse {
	private Long id;
	private String title;
	private String description;
	private Long price;
	private CourseLevel level;
	private Long instructorId;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public CourseResponse(Long id, String title, String description, Long price, CourseLevel level, Long instructorId, LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.level = level;
		this.instructorId = instructorId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
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

	public Long getInstructorId() {
		return instructorId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
}
