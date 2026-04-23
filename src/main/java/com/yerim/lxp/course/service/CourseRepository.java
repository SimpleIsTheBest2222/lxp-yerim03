package com.yerim.lxp.course.service;

import java.util.List;
import java.util.Optional;

import com.yerim.lxp.course.domain.Course;

public interface CourseRepository {
	Course save(Course course);

	Optional<Course> findById(Long id);

	List<Course> findAll();

	void deleteById(Long id);
}
