package com.yerim.lxp.course.controller;


import com.yerim.lxp.course.repository.InMemoryCourseRepository;
import com.yerim.lxp.course.service.CourseService;
import com.yerim.lxp.course.view.CourseInputView;
import com.yerim.lxp.course.view.CourseOutputView;

public class CourseController {
	static CourseOutputView output = new CourseOutputView();
	static CourseInputView input = new CourseInputView();
	static CourseService courseService = new CourseService(new InMemoryCourseRepository());

	public void handleSelection() {
		while(true) {
			output.printCourseMainMenu();
			String selection = input.readSelection();

			if (selection.equals("1")) {
				System.out.println("아직 개발되지 않은 메뉴입니다.");
				// createCourse();
			} else if (selection.equals("2")) {
				System.out.println("아직 개발되지 않은 메뉴입니다.");
				// getAllCourses();
			} else if (selection.equals("3")) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	private void createCourse() {}

	private void getAllCourses() {}

	private void getCourseById() {}

	private void updateCourse() {}

	private void deleteCourse() {}
}
