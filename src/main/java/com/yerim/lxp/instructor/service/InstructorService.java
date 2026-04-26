package com.yerim.lxp.instructor.service;

import java.util.List;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.request.InstructorCreateRequest;
import com.yerim.lxp.instructor.dto.request.InstructorUpdateRequest;

public class InstructorService {
	private final InstructorRepository instructorRepository;

	public InstructorService(InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
	}

	public Instructor create(InstructorCreateRequest instructorCreateRequest) {
		Instructor instructor = Instructor.create(instructorCreateRequest.getName(), instructorCreateRequest.getIntroduction());
		return instructorRepository.save(instructor);
	}

	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}

	public Instructor findById(Long id) {
		return instructorRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 강사입니다."));
	}

	public Instructor update(InstructorUpdateRequest request) {
		Instructor instructor = instructorRepository.findById(request.getId())
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 강사입니다."));
		instructor.update(request.getName(), request.getIntroduction());
		return instructorRepository.save(instructor);
	}

	public void delete(Long id) {}

}