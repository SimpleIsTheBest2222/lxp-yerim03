package com.yerim.lxp.instructor.controller;

import java.util.List;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.InstructorRequest;
import com.yerim.lxp.instructor.dto.InstructorResponse;
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
			List<InstructorResponse> instructors = instructorService.getAllInstructors();

			if (instructors.isEmpty()) {
				System.out.println("등록된 강사가 없습니다.");
			}

			output.showAllInstructors(instructors);
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
			System.out.print("조회할 강사 id를 입력해주세요: ");
			String selection = input.readSelection();
			Instructor instructor = instructorService.getInstructorById(Long.parseLong(selection));
			if (instructor == null) {
				System.out.println("존재하지 않는 강사입니다.");
			}
			InstructorResponse instructorResponse = new InstructorResponse(instructor.getId(), instructor.getName(), instructor.getIntroduction());
			output.printDetailInstructor(instructorResponse);

			String selection1 = input.readSelection();
			if (selection1.equals("1")) {
				updateInstructor();
			} else if (selection1.equals("2")) {
				deleteInstructor();
				break;
			} else if (selection1.equals("3")) {
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