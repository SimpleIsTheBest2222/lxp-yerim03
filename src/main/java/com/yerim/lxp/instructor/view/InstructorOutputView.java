package com.yerim.lxp.instructor.view;

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
}
