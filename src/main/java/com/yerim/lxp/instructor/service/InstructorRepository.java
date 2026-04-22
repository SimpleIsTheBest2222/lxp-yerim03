package com.yerim.lxp.instructor.service;

import java.util.List;
import java.util.Optional;

import com.yerim.lxp.instructor.domain.Instructor;

public interface InstructorRepository {

	Instructor save(Instructor instructor);

	Optional<Instructor> findById(Long id);

	List<Instructor> findAll();

	void deleteById(Long id);
}
