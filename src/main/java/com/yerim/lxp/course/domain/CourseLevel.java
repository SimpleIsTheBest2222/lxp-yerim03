package com.yerim.lxp.course.domain;

public enum CourseLevel {
	LOW,
	MIDDLE,
	HIGH;

	public String getDisplayName() {
		return switch (this) {
			case LOW -> "초급";
			case MIDDLE -> "중급";
			case HIGH -> "고급";
		};
	}
}
