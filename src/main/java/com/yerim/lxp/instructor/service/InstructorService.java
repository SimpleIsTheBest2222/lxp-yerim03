package com.yerim.lxp.instructor.service;

import java.util.ArrayList;
import java.util.List;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.InstructorRequest;
import com.yerim.lxp.instructor.dto.InstructorResponse;

public class InstructorService {
	private final InstructorRepository instructorRepository;

	public InstructorService(InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
	}

	public Instructor create(InstructorRequest instructorRequest) {
		Instructor instructor = Instructor.create(instructorRequest.getName(), instructorRequest.getIntroduction());
		return instructorRepository.save(instructor);
	}

	public List<InstructorResponse> findAll() {
		List<Instructor> instructors = instructorRepository.findAll();
		List<InstructorResponse> responses = new ArrayList<>();

		for (Instructor instructor : instructors) {
			responses.add(new InstructorResponse(
				instructor.getId(),
				instructor.getName(),
				instructor.getIntroduction()
			));
		}
		return responses;
	}

	public Instructor findDetailById(Long id) {
		Instructor instructor = instructorRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 강사입니다."));

		return instructor;
	}

	public void update(Long id, InstructorRequest instructorRequest) {}

	public void delete(Long id) {}

}