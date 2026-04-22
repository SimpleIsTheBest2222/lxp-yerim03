package com.yerim.lxp.instructor.view;

import java.util.Scanner;

public class InstructorInputView {
	Scanner sc = new Scanner(System.in);

	public String readSelection() {
		System.out.print(">_ ");
		String selection = sc.nextLine();
		return selection;
	}
}
