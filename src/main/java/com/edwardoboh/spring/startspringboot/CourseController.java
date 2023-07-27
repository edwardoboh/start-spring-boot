package com.edwardoboh.spring.startspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> fetchAllCources(){
		return Arrays.asList(
				new Course(1, "Title One", "Author"),
				new Course(2, "Title Two", "Mapple"),
				new Course(3, "Third Title", "Apple"),
				new Course(3, "Third Title", "Apple"),
				new Course(3, "Third Title", "Apple")
		);
	}

}
