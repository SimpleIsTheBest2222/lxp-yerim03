package com.yerim.lxp.instructor.controller;

import java.util.List;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.request.InstructorCreateRequest;
import com.yerim.lxp.instructor.dto.request.InstructorUpdateRequest;
import com.yerim.lxp.instructor.dto.response.InstructorCreateResponse;
import com.yerim.lxp.instructor.dto.response.InstructorDeleteResponse;
import com.yerim.lxp.instructor.dto.response.InstructorDetailResponse;
import com.yerim.lxp.instructor.dto.response.InstructorListResponse;
import com.yerim.lxp.instructor.dto.response.InstructorUpdateResponse;
import com.yerim.lxp.instructor.repository.InMemoryInstructorRepository;
import com.yerim.lxp.instructor.service.InstructorService;
import com.yerim.lxp.instructor.view.InstructorInputView;
import com.yerim.lxp.instructor.view.InstructorOutputView;

public class InstructorController {
	static InstructorOutputView output = new InstructorOutputView();
	static InstructorInputView input = new InstructorInputView();
	static InstructorService instructorService = new InstructorService(new InMemoryInstructorRepository());

	public InstructorCreateResponse create(InstructorCreateRequest instructorCreateRequest) {
		Instructor created = instructorService.create(instructorCreateRequest);
		return new InstructorCreateResponse(created.getId());
	}

	public List<InstructorListResponse> findAll() {
		List<Instructor> instructors = instructorService.findAll();

		List<InstructorListResponse> responses = instructors.stream()
			.map(instructor -> new InstructorListResponse(instructor.getId(), instructor.getName()))
			.toList();
		return responses;
	}

	public InstructorDetailResponse findById(Long id) {
		Instructor instructor = instructorService.findById(id);
		return new InstructorDetailResponse(instructor.getId(), instructor.getName(), instructor.getIntroduction());
	}

	public InstructorUpdateResponse update(InstructorUpdateRequest request) {
		Instructor updated = instructorService.update(request);
		return new InstructorUpdateResponse(updated.getId());
	}

	public InstructorDeleteResponse delete(Long id) {
		instructorService.delete(id);
		return new InstructorDeleteResponse(id);
	}
}