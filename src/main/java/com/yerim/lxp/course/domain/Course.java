package com.yerim.lxp.course.domain;

import java.time.LocalDateTime;

public class Course {
	private static final int MAXIMUM_TITLE_RANGE = 50;
	private static final int MAXIMUM_DESCRIPTION_RANGE = 200;
	private static final long MINIMUM_PRICE = 0L;

	private Long id;
	private String title;
	private String description;
	private Long price;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private CourseLevel level;
	private Long instructorId;

	public static Course create(String title, String description, Long price, Long instructorId) {
		Course course = new Course();
		course.title = validateTitle(title);
		course.description = validateDescription(description);
		course.price = validatePrice(price);
		course.level = CourseLevel.LOW;
		course.instructorId = validateInstructorId(instructorId);
		course.createdAt = LocalDateTime.now();
		course.updatedAt = LocalDateTime.now();
		return course;
	}

	public static Course createWithId(Long id, String title, String description, Long price, CourseLevel level, Long instructorId) {
		Course course = new Course();
		course.id = id;
		course.title = validateTitle(title);
		course.description = validateDescription(description);
		course.price = validatePrice(price);
		course.level = validateLevel(level);
		course.instructorId = validateInstructorId(instructorId);
		course.createdAt = LocalDateTime.now();
		course.updatedAt = LocalDateTime.now();
		return course;
	}

	public void update(String title, String description, Long price, CourseLevel level, Long instructorId) {
		if (title != null) {
			this.title = validateTitle(title);
		}
		if (description != null) {
			this.description = validateDescription(description);
		}
		if (price != null) {
			this.price = validatePrice(price);
		}
		if (level != null) {
			this.level = validateLevel(level);
		}
		if (instructorId != null) {
			this.instructorId = validateInstructorId(instructorId);
		}
		this.updatedAt = LocalDateTime.now();
	}

	private static String validateTitle(String title) {
		if (title == null || title.isBlank()) {
			throw new IllegalArgumentException("강의명은 필수 입력값입니다.");
		}
		if (title.length() > MAXIMUM_TITLE_RANGE) {
			throw new IllegalArgumentException("강의명 길이는 최대 50 입니다.");
		}
		return title;
	}

	private static String validateDescription(String description) {
		if (description == null || description.isBlank()) {
			throw new IllegalArgumentException("강의 설명은 필수 입력값입니다.");
		}
		if (description.length() > MAXIMUM_DESCRIPTION_RANGE) {
			throw new IllegalArgumentException("강의 설명 길이는 최대 200 입니다.");
		}
		return description;
	}

	private static Long validatePrice(Long price) {
		if (price == null) {
			throw new IllegalArgumentException("강의 가격은 필수 입력값입니다.");
		}
		if (price < MINIMUM_PRICE) {
			throw new IllegalArgumentException("강의 가격은 0 이상이어야 합니다.");
		}
		return price;
	}

	private static CourseLevel validateLevel(CourseLevel level) {
		if (level == null) {
			throw new IllegalArgumentException("강의 레벨은 필수 입력값입니다.");
		}
		return level;
	}

	private static Long validateInstructorId(Long instructorId) {
		if (instructorId == null) {
			throw new IllegalArgumentException("강사 ID는 필수 입력값입니다.");
		}
		return instructorId;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public CourseLevel getLevel() {
		return level;
	}

	public Long getInstructorId() {
		return instructorId;
	}
}