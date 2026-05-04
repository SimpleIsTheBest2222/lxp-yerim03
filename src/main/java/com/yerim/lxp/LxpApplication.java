package com.yerim.lxp;

import com.yerim.lxp.course.controller.CourseController;
import com.yerim.lxp.instructor.view.InstructorViewFlow;
import com.yerim.lxp.view.MainInputView;
import com.yerim.lxp.view.MainOutputView;

public class LxpApplication {
	static MainOutputView mainOutputView = new MainOutputView();
	static MainInputView mainInputView = new MainInputView();
	static InstructorViewFlow instructorViewFlow = new InstructorViewFlow();
	static CourseController courseController = new CourseController();

	public static void main(String[] args) {
		boolean isRunning = true;

		while (isRunning) {
			mainOutputView.printMainMenu();
			String selection = mainInputView.readSelection();
			isRunning = validateSelection(selection);
		}
	}

	private static boolean validateSelection(String selection) {
		switch (selection) {
			case "1" -> {
				courseController.handleSelection();
				return true;
			}
			case "2" -> {
				instructorViewFlow.start();
				return true;
			}
			case "3" -> {
				System.out.println("프로그램을 종료합니다.");
				return false;
			}
			default -> {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				return true;
			}
		}
	}
}
