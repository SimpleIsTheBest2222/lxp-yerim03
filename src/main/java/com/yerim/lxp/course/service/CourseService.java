package com.yerim.lxp.course.service;

import com.yerim.lxp.course.domain.Course;
import com.yerim.lxp.course.dto.CourseCreateRequest;
import com.yerim.lxp.course.dto.CourseUpdateRequest;

public class CourseService {
	private final CourseRepository courseRepository;

	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public Course createCourse(CourseCreateRequest courseCreateRequest) {
		return null;
	}

	public void getAllCourses() {}

	public void getCourseById(Long id) {}

	public void updateCourse(Long id, CourseUpdateRequest courseUpdateRequest) {}

	public void deleteCourse(Long id) {}
}
