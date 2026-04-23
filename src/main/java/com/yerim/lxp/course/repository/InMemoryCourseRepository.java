package com.yerim.lxp.course.repository;

import java.util.List;
import java.util.Optional;

import com.yerim.lxp.course.domain.Course;
import com.yerim.lxp.course.service.CourseRepository;

public class InMemoryCourseRepository implements CourseRepository {

	@Override
	public Course save(Course course) {
		return null;
	}

	@Override
	public Optional<Course> findById(Long id) {
		return Optional.empty();
	}

	@Override
	public List<Course> findAll() {
		return List.of();
	}

	@Override
	public void deleteById(Long id) {

	}
}
