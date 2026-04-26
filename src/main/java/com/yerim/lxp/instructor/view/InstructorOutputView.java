package com.yerim.lxp.instructor.view;

import java.util.List;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.response.InstructorDetailResponse;
import com.yerim.lxp.instructor.dto.response.InstructorListResponse;

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

	public void printCreateInstructor() {
		System.out.print("""
			
			============================================================
			                           강사 등록                           
			============================================================
			
			  강사 정보를 입력하세요.
			  
			  """);
	}

	public void printCreated(Instructor instructor) {
		System.out.println("강사가 등록되었습니다. id: " + instructor.getId());
	}

	public void showAllInstructors(List<InstructorListResponse> instructors) {
		System.out.println("""
		
			============================================================
			                           강사 목록                           
			============================================================
			""");

		for (InstructorListResponse instructor : instructors) {
			System.out.println(instructor.getId() + ". " + instructor.getName());
		}

		System.out.println("""
		
			------------------------------------------------------------
			  1. 강사 선택
			  2. 뒤로 가기
		
			------------------------------------------------------------
		
			""");
	}

	public void printDetailInstructor(InstructorDetailResponse InstructorDetailResponse) {
		System.out.print("""
			
			============================================================
			                           강사 상세                          
			============================================================
			
			  강사 id  : %d
			  이름     : %s
			  소개     : %s
			
			------------------------------------------------------------
			
			  1. 강사 수정
			  2. 강사 삭제
			  3. 뒤로 가기
			
			------------------------------------------------------------
			""".formatted(InstructorDetailResponse.getId(), InstructorDetailResponse.getName(), InstructorDetailResponse.getIntroduction()));
	}

	public void printUpdateInstructor() {
		System.out.print("""
			============================================================
			                           강사 수정                           
			============================================================
			
			  빈 값 입력 시 기존 값이 유지됩니다.
			------------------------------------------------------------
			""");
	}

	public void printUpdated() {
		System.out.print("""
			------------------------------------------------------------
			  수정되었습니다.
			------------------------------------------------------------
			
			""");
	}

	public void printDeleted() {
		System.out.print("""
			------------------------------------------------------------
			  삭제가 완료되었습니다. id: 2
			------------------------------------------------------------	
			
		""");
	}
}