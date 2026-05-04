package com.yerim.lxp.instructor.view;

import java.util.List;

import com.yerim.lxp.instructor.controller.InstructorController;
import com.yerim.lxp.instructor.dto.request.InstructorCreateRequest;
import com.yerim.lxp.instructor.dto.request.InstructorUpdateRequest;
import com.yerim.lxp.instructor.dto.response.InstructorCreateResponse;
import com.yerim.lxp.instructor.dto.response.InstructorDeleteResponse;
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
				return;
			} else {
				outputView.printInvalidInputMessage();
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
				return;
			} else {
				outputView.printInvalidInputMessage();
			}
		}
	}

	public void showInstructorDetail() {
		Long id = inputView.selectInstructor();
		InstructorDetailResponse response = instructorController.findById(id);
		outputView.showDetailInstructor(response);

		while (true) {
			outputView.detailInstructorMenu();
			String selection = inputView.read();

			if (selection.equals("1")) {
				updateInstructor(id);
			} else if (selection.equals("2")) {
				deleteInstructor(id);
				return;
			} else if (selection.equals("3")) {
				return;
			} else {
				outputView.printInvalidInputMessage();
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
		InstructorDeleteResponse response = instructorController.delete(id);
		outputView.printDeleteSuccess(response);
	}
}
