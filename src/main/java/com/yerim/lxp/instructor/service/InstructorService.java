package com.yerim.lxp.instructor.service;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.dto.InstructorRequest;
import com.yerim.lxp.instructor.repository.InMemoryInstructorRepository;

public class InstructorService {
	private final InMemoryInstructorRepository instructorRepository = new InMemoryInstructorRepository();

	public Instructor createInstructor(InstructorRequest instructorRequest) {
		Instructor instructor = Instructor.create(instructorRequest.getName(), instructorRequest.getIntroduction());
		return instructorRepository.save(instructor);
	}

	public void getAllInstructors() {}

	public void updateInstructor() {}

	public void deleteInstructor() {}

}