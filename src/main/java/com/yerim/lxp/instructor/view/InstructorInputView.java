package com.yerim.lxp.instructor.view;

import java.util.Scanner;

import com.yerim.lxp.instructor.dto.request.InstructorCreateRequest;

public class InstructorInputView {
	Scanner sc = new Scanner(System.in);

	public String readSelection() {
		System.out.print(">_ ");
		String selection = sc.nextLine();
		return selection;
	}

	public InstructorCreateRequest inputCreateInstructor() {
		System.out.print("이름  :  ");
		String name = sc.nextLine();
		System.out.print("소개  :  ");
		String introduction = sc.nextLine();
		return new InstructorCreateRequest(name, introduction);
	}

	public void selectInstructor() {}


	public String readDetailSelection() {
		return null;
	}

	public void inputUpdateInstructor() {
		System.out.print("이름  :  ");
		String name = sc.nextLine();
		System.out.print("소개  :  ");
		String introduction = sc.nextLine();
	}
}