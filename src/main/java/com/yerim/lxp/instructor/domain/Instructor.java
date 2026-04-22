package com.yerim.lxp.instructor.domain;

public class Instructor {
	private static final int MAXIMUM_NAME_RANGE = 10;
	private static final int MAXIMUM_INTRODUCTION_RANGE = 100;

	private Long id;
	private String name;
	private String introduction;

	private Instructor() {}

	public void setId(Long id) {
		this.id = id;
	}

	public static Instructor create(String name, String introduction) {
		Instructor instructor = new Instructor();
		instructor.name = validateName(name);
		instructor.introduction = validateIntroduction(introduction);
		return instructor;
	}

	public static Instructor createWithId(Long id, String name, String introduction) {
		Instructor instructor = new Instructor();
		instructor.id = id;
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

	private static String validateName(String name) {
		if(name == null || name.isEmpty() || name.length() > MAXIMUM_NAME_RANGE) {
			throw new IllegalArgumentException("강사명 길이는 최대 10 입니다.");
		}
		return name;
	}

	private static String validateIntroduction(String introduction) {
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
}