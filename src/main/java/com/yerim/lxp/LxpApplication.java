package com.yerim.lxp;

import com.yerim.lxp.instructor.controller.InstructorController;
import com.yerim.lxp.view.MainInputView;
import com.yerim.lxp.view.MainOutputView;

public class LxpApplication {
	static MainOutputView mainOutputView = new MainOutputView();
	static MainInputView mainInputView = new MainInputView();
	static InstructorController instructorController = new InstructorController();

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
				System.out.println("아직 개발되지 않은 메뉴입니다.");
				return true;
			}
			case "2" -> {
				instructorController.handleSelection();
				return true;
			}
			case "3" -> {
				return false;
			}
			default -> {
				System.out.println("잘못된 번호입니다.");
				return true;
			}
		}
	}
}
