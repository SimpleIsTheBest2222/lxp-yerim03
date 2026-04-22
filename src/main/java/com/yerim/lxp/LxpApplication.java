package com.yerim.lxp;

import com.yerim.lxp.instructor.controller.InstructorController;
import com.yerim.lxp.view.MainInputView;
import com.yerim.lxp.view.MainOutputView;

public class LxpApplication {
	static MainOutputView mainOutputView = new MainOutputView();
	static MainInputView mainInputView = new MainInputView();
	static InstructorController instructorController = new InstructorController();

	public static void main(String[] args) {

		while (true) {
			mainOutputView.printMainMenu();
			String selection = mainInputView.readSelection();

			if (selection.equals("3")) {
				break;
			}
			validateSelection(selection);
		}
	}

	public static void validateSelection(String selection) {
		if (selection.equals("1")) {
			//강의 관리 기능 추가 예정
		} else if (selection.equals("2")) {
			instructorController.handleSelection();
		}
	}
}
