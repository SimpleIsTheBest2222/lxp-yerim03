package com.yerim.lxp.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.yerim.lxp.instructor.domain.Instructor;

class InstructorTest {

	@Test
	@DisplayName("성공: 유효한 이름과 설명으로 강사가 생성된다")
	void createInstructor_Success() {
		// Given
		String name = "김강사";
		String intro = "반갑습니다. 테스트 강의입니다.";

		// When
		Instructor instructor = Instructor.create(name, intro);

		// Then
		assertAll(
			() -> assertEquals(name, instructor.getName()),
			() -> assertEquals(intro, instructor.getIntroduction())
		);
	}

	@Test
	@DisplayName("실패: 강사명이 null이거나 빈 값이면 예외가 발생한다")
	void createInstructor_Fail_NameEmpty() {
		assertThrows(IllegalArgumentException.class, () -> Instructor.create(null, "소개"));
		assertThrows(IllegalArgumentException.class, () -> Instructor.create("", "소개"));
		assertThrows(IllegalArgumentException.class, () -> Instructor.create("  ", "소개"));
	}

	@Test
	@DisplayName("실패: 강사명이 10자를 초과하면 예외가 발생한다")
	void createInstructor_Fail_NameLength() {
		String longName = "가나다라마바사아자차카"; // 11자
		assertThrows(IllegalArgumentException.class, () -> Instructor.create(longName, "소개"));
	}

	@Test
	@DisplayName("실패: 강사 설명이 없으면 예외가 발생한다")
	void createInstructor_Fail_IntroEmpty() {
		assertThrows(IllegalArgumentException.class, () -> Instructor.create("김강사", null));
		assertThrows(IllegalArgumentException.class, () -> Instructor.create("김강사", ""));
	}

	@Test
	@DisplayName("실패: 강사 설명이 100자를 초과하면 예외가 발생한다")
	void createInstructor_Fail_IntroLength() {
		String longIntro = "a".repeat(101); // 101자 생성
		assertThrows(IllegalArgumentException.class, () -> Instructor.create("김강사", longIntro));
	}

	@Test
	@DisplayName("성공: 강사 정보를 수정하면 값이 변경된다")
	void update_Success() {
		// Given
		Instructor instructor = Instructor.create("이름", "소개");

		// When
		instructor.update("새이름", "새소개");

		// Then
		assertEquals("새이름", instructor.getName());
		assertEquals("새소개", instructor.getIntroduction());
	}

	@Test
	@DisplayName("실패: 수정 시 이름이 10자를 초과하면 예외가 발생한다")
	void update_Fail_NameLength() {
		Instructor instructor = Instructor.create("이름", "소개");
		assertThrows(IllegalArgumentException.class, () -> instructor.update("가나다라마바사아자차카", "새소개"));
	}
}