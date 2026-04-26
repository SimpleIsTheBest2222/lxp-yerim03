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
			instructor = instructor.createWithId(++sequence, instructor.getName(), instructor.getIntroduction());
		}
		Instructor saved = instructor;
		storage.put(saved.getId(), saved);
		return saved;
	}

	@Override
	public Optional<Instructor> findById(Long id) {
		return Optional.ofNullable(storage.get(id))
			.filter(instructor -> !instructor.isDeleted());
	}

	@Override
	public List<Instructor> findAll() {
		return storage.values().stream()
			.filter(instructor -> !instructor.isDeleted())
			.toList();
	}

	@Override
	public void deleteById(Long id) {
		Instructor instructor = storage.get(id);
		if (instructor != null) {
			instructor.delete();
		}
	}
}