package com.yerim.lxp.instructor.view;

import java.util.List;

import com.yerim.lxp.instructor.controller.InstructorController;
import com.yerim.lxp.instructor.dto.request.InstructorCreateRequest;
import com.yerim.lxp.instructor.dto.request.InstructorUpdateRequest;
import com.yerim.lxp.instructor.dto.response.InstructorCreateResponse;
import com.yerim.lxp.instructor.dto.response.InstructorDetailResponse;
import com.yerim.lxp.instructor.dto.response.InstructorListResponse;
import com.yerim.lxp.instructor.dto.response.InstructorUpdateResponse;

public class InstructorViewFlow {
	private final InstructorInputView inputView = new InstructorInputView();
	private final InstructorOutputView outputView = new InstructorOutputView();
	private final InstructorController instructorController = new InstructorController();

	public void start() {
		while(true) {
			outputView.instructorMainMenu();
			String selection = inputView.read();

			if (selection.equals("1")) {
				createInstructor();
			} else if (selection.equals("2")) {
				findAllInstructor();
			} else if (selection.equals("3")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	public void createInstructor() {
		outputView.createInstructor();
		InstructorCreateRequest request = inputView.createInstructor();
		InstructorCreateResponse response = instructorController.create(request);
		outputView.printCreateSuccess(response);
	}

	public void findAllInstructor() {
		while (true) {
			List<InstructorListResponse> responses = instructorController.findAll();
			outputView.showAllInstructors(responses);

			outputView.selectInstructorMenu();
			String selection = inputView.read();
			if (selection.equals("1")) {
				showInstructorDetail();
			} else if (selection.equals("2")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	public void showInstructorDetail() {
		Long id = inputView.selectInstructor();

		while (true) {
			InstructorDetailResponse response = instructorController.findById(id);
			outputView.showDetailInstructor(response);

			outputView.detailInstructorMenu();
			String selection = inputView.read();

			if (selection.equals("1")) {
				updateInstructor(id);
			} else if (selection.equals("2")) {
				deleteInstructor(id);
				break;
			} else if (selection.equals("3")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	public void updateInstructor(Long id) {
		outputView.updateInstructor();
		InstructorUpdateRequest request = inputView.updateInstructor(id);
		InstructorUpdateResponse response = instructorController.update(request);
		outputView.printUpdateSuccess(response);
	}

	public void deleteInstructor(Long id) {
		System.out.println("아직 개발되지 않은 기능");
	}
}
