package com.yerim.lxp.instructor.view;

import com.yerim.lxp.instructor.domain.Instructor;

public class InstructorOutputView {

	public void printInstructorMainMenu() {
		System.out.print("""
			============================================================
			                           강사 관리                          
			============================================================
			
			  1. 강사 등록
			  2. 강사 조회
			  3. 뒤로 가기
			
			------------------------------------------------------------
			""");
	}

	public void printCreateInstructor() {}

	public void printCreated(Instructor instructor) {
		System.out.println("강사가 등록되었습니다. id: " + instructor.getId());
	}

	public void showAllInstructors() {}
}