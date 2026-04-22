package com.yerim.lxp.instructor.controller;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.InstructorRequest;
import com.yerim.lxp.instructor.service.InstructorService;
import com.yerim.lxp.instructor.view.InstructorInputView;
import com.yerim.lxp.instructor.view.InstructorOutputView;

public class InstructorController {
	static InstructorOutputView output = new InstructorOutputView();
	static InstructorInputView input = new InstructorInputView();
	static InstructorService instructorService = new InstructorService();

	public void handleSelection() {
		while(true) {
			output.printInstructorMainMenu();
			String selection = input.readSelection();

			if (selection.equals("1")) {
				createInstructor();
			} else if (selection.equals("2")) {
				System.out.println("아직 개발되지 않은 메뉴입니다.");
			} else if (selection.equals("3")) {
				break;
			}
		}
	}

	private void createInstructor() {
		InstructorRequest instructorRequest = input.createInstructor();
		Instructor created = instructorService.createInstructor(instructorRequest);
		output.printCreated(created);
	}
}
