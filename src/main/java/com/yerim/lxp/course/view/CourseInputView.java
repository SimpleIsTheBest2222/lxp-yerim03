package com.yerim.lxp.course.view;

import java.util.Scanner;

public class CourseInputView {
	private final Scanner sc = new Scanner(System.in);

	public String readSelection() {
		System.out.print(">_ ");
		String selection = sc.nextLine();
		return selection;
	}
}
