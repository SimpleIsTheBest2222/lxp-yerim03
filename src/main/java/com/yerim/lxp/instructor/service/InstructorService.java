package com.yerim.lxp.instructor.service;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.InstructorRequest;

public class InstructorService {
	private final InstructorRepository instructorRepository;

	public InstructorService(InstructorRepository instructorRepository) {
		this.instructorRepository = instructorRepository;
	}

	public Instructor createInstructor(InstructorRequest instructorRequest) {
		Instructor instructor = Instructor.create(instructorRequest.getName(), instructorRequest.getIntroduction());
		return instructorRepository.save(instructor);
	}

	public void getAllInstructors() {}

	public void getInstructorById(Long id) {}

	public void updateInstructor(Long id, InstructorRequest instructorRequest) {}

	public void deleteInstructor(Long id) {}

}