package lab.openapi.service;

import java.util.Optional;

import lab.openapi.model.Course;

public interface CourseService {

	Course createCourse(Course course);
	
	Optional<Course> getCourseById(long courseId);
	
	Iterable<Course> getCoursesByCategory(String category);
	
	Iterable<Course> getCourses();
	
	Course updateCourse(long courseId, Course course);
	
	void deleteCourseById(long courseId);

	void deleteCourses();
}
