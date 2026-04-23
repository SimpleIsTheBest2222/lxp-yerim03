package com.yerim.lxp.instructor.controller;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.InstructorRequest;
import com.yerim.lxp.instructor.repository.InMemoryInstructorRepository;
import com.yerim.lxp.instructor.service.InstructorService;
import com.yerim.lxp.instructor.view.InstructorInputView;
import com.yerim.lxp.instructor.view.InstructorOutputView;

public class InstructorController {
	static InstructorOutputView output = new InstructorOutputView();
	static InstructorInputView input = new InstructorInputView();
	static InstructorService instructorService = new InstructorService(new InMemoryInstructorRepository());

	public void handleSelection() {
		while(true) {
			output.printInstructorMainMenu();
			String selection = input.readSelection();

			if (selection.equals("1")) {
				createInstructor();
			} else if (selection.equals("2")) {
				getAllInstructors();
			} else if (selection.equals("3")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	private void createInstructor() {
		output.printCreateInstructor();
		InstructorRequest instructorRequest = input.inputCreateInstructor();
		Instructor created = instructorService.createInstructor(instructorRequest);
		output.printCreated(created);
	}

	private void getAllInstructors() {
		while (true) {
			output.showAllInstructors();
			String selection = input.readSelection();

			if (selection.equals("1")) {
				getInstructorById();
			} else if (selection.equals("2")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	private void getInstructorById() {
		while (true) {
			output.printDetailInstructor();
			String selection = input.readSelection();

			if (selection.equals("1")) {
				updateInstructor();
			} else if (selection.equals("2")) {
				deleteInstructor();
				break;
			} else if (selection.equals("3")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	private void updateInstructor() {
		output.printUpdateInstructor();
		input.inputUpdateInstructor();
		output.printUpdated();
	}

	private void deleteInstructor() {
		output.printDeleted();
	}
}