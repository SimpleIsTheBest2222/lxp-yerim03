package com.yerim.lxp.instructor.view;

import java.util.List;

import com.yerim.lxp.instructor.dto.response.InstructorCreateResponse;
import com.yerim.lxp.instructor.dto.response.InstructorDeleteResponse;
import com.yerim.lxp.instructor.dto.response.InstructorDetailResponse;
import com.yerim.lxp.instructor.dto.response.InstructorListResponse;
import com.yerim.lxp.instructor.dto.response.InstructorUpdateResponse;

public class InstructorOutputView {
	
	public void instructorMainMenu() {
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

	public void createInstructor() {
		System.out.print("""
			
			============================================================
			                           강사 등록                           
			============================================================
			
			  강사 정보를 입력하세요.
			
			""");
	}

	public void printCreateSuccess(InstructorCreateResponse response) {
		System.out.println("강사가 등록되었습니다. id: " + response.getId());
	}

	public void showAllInstructors(List<InstructorListResponse> responses) {
		System.out.println("""
			
			============================================================
			                           강사 목록                           
			============================================================
			""");

		for (InstructorListResponse res : responses) {
			System.out.println(res.getId() + ". " + res.getName());
		}
	}

	public void selectInstructorMenu() {
		System.out.println("""
			
			------------------------------------------------------------
			
			  1. 강사 선택
			  2. 뒤로 가기
			
			------------------------------------------------------------
			""");
	}

	public void showDetailInstructor(InstructorDetailResponse InstructorDetailResponse) {
		System.out.print("""
			
			============================================================
			                           강사 상세                          
			============================================================
			
			  강사 id  : %d
			  이름     : %s
			  소개     : %s

			""".formatted(
				InstructorDetailResponse.getId(),
				InstructorDetailResponse.getName(),
				InstructorDetailResponse.getIntroduction())
		);
	}

	public void detailInstructorMenu() {
		System.out.print("""
			------------------------------------------------------------
			
			  1. 강사 수정
			  2. 강사 삭제
			  3. 뒤로 가기
			
			------------------------------------------------------------
			""");
	}


	public void updateInstructor() {
		System.out.print("""
			
			============================================================
			                           강사 수정                           
			============================================================
			
			  빈 값 입력 시 기존 값이 유지됩니다.
			------------------------------------------------------------
			""");
	}

	public void printUpdateSuccess(InstructorUpdateResponse response) {
		System.out.println("------------------------------------------------------------");
		System.out.println("수정되었습니다. id: " + response.getId());
		System.out.println("------------------------------------------------------------");
	}

	public void printDeleteSuccess(InstructorDeleteResponse response) {
		System.out.println("------------------------------------------------------------");
		System.out.println(" 삭제가 완료되었습니다. id: " + response.getId());
		System.out.println("------------------------------------------------------------");
	}

	public void printInvalidInputMessage() {
		System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
	}
}