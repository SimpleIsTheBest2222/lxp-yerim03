package com.yerim.lxp.instructor.domain;

public class Instructor {
	private static final int MAXIMUM_NAME_RANGE = 10;
	private static final int MAXIMUM_INTRODUCTION_RANGE = 100;

	private Long id;
	private String name;
	private String introduction;
	private boolean isDeleted = false;

	private Instructor() {}

	public static Instructor create(String name, String introduction) {
		Instructor instructor = new Instructor();
		instructor.name = validateName(name);
		instructor.introduction = validateIntroduction(introduction);
		return instructor;
	}

	public static Instructor createWithId(Long id, String name, String introduction) {
		Instructor instructor = new Instructor();
		instructor.id = validateId(id);
		instructor.name = validateName(name);
		instructor.introduction = validateIntroduction(introduction);
		return instructor;
	}

	public void update(String name, String introduction) {
		if (name != null) {
			this.name = validateName(name);
		}
		if (introduction != null) {
			this.introduction = validateIntroduction(introduction);
		}
	}

	private static Long validateId(Long id) {
		if (id == null || id <= 0) {
			throw new IllegalArgumentException("강사 ID는 필수입니다.");
		}
		return id;
	}

	private static String validateName(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("강사명은 필수 입력값입니다.");
		}
		if(name.length() > MAXIMUM_NAME_RANGE) {
			throw new IllegalArgumentException("강사명 길이는 최대 10 입니다.");
		}
		return name;
	}

	private static String validateIntroduction(String introduction) {
		if(introduction == null || introduction.isEmpty()) {
			throw new IllegalArgumentException("강사 설명은 필수 입력값입니다.");
		}
		if(introduction == null || introduction.isEmpty() || introduction.length() > MAXIMUM_INTRODUCTION_RANGE) {
			throw new IllegalArgumentException("강사 설명 길이는 최대 100 입니다.");
		}
		return introduction;
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

	public boolean isDeleted() {
		return isDeleted;
	}

	public void delete() {
		this.isDeleted = true;
	}
}