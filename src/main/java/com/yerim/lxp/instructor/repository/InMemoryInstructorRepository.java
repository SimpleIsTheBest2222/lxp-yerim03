package com.yerim.lxp.instructor.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.yerim.lxp.instructor.domain.Instructor;
import com.yerim.lxp.instructor.service.InstructorRepository;

public class InMemoryInstructorRepository implements InstructorRepository {

	private final Map<Long, Instructor> storage = new HashMap<>();
	private Long sequence = 0L;

	@Override
	public Instructor save(Instructor instructor) {
		if (instructor.getId() == null) {
			instructor.createWithId(++sequence, instructor.getName(), instructor.getIntroduction());
		}
		Instructor saveInstructor = instructor;
		storage.put(saveInstructor.getId(), saveInstructor);
		return saveInstructor;
	}

	@Override
	public Optional<Instructor> findById(Long id) {
		return Optional.empty();
	}

	@Override
	public List<Instructor> findAll() {
		return List.of();
	}

	@Override
	public void deleteById(Long id) {
	}
}