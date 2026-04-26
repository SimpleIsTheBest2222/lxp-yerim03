package com.yerim.lxp.instructor.service;

import java.util.List;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.request.InstructorCreateRequest;

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

	public Instructor findDetailById(Long id) {
		Instructor instructor = instructorRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 강사입니다."));

		return instructor;
	}

	public void update(Long id, InstructorCreateRequest instructorCreateRequest) {}

	public void delete(Long id) {}

}