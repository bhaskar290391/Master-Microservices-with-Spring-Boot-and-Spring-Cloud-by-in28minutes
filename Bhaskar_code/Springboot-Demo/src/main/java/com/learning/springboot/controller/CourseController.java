package com.learning.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.entity.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> retrieveCourseData(){
		
		return Arrays.asList(new Course(1, "Learn AWs", "Bhaskar mUdaliyar"),new Course(1, "Learn Java", "Bhaskar mUdaliyar"));
	}
}
