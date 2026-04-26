package com.yerim.lxp.instructor.view;

import java.util.Scanner;

import com.yerim.lxp.instructor.dto.request.InstructorCreateRequest;
import com.yerim.lxp.instructor.dto.request.InstructorUpdateRequest;

public class InstructorInputView {
	Scanner sc = new Scanner(System.in);

	public String read() {
		System.out.print(">_ ");
		String selection = sc.nextLine();
		return selection;
	}

	public InstructorCreateRequest createInstructor() {
		System.out.print("  이름  :  ");
		String name = sc.nextLine();
		System.out.print("  소개  :  ");
		String introduction = sc.nextLine();
		return new InstructorCreateRequest(name, introduction);
	}

	public Long selectInstructor() {
		System.out.print("  조회할 강사 id를 입력해주세요: ");
		String id = sc.nextLine();
		return Long.valueOf(id);
	}

	public InstructorUpdateRequest updateInstructor(Long id) {
		System.out.print("  이름  :  ");
		String name = sc.nextLine();
		System.out.print("  소개  :  ");
		String introduction = sc.nextLine();
		return new InstructorUpdateRequest(id, name, introduction);
	}
}