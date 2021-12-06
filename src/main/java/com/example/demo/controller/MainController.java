package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class MainController {
	List<Student> list = new ArrayList<Student>();

	@GetMapping("/hello")
	public String hello() {
		return "Hello, Kiran!";
	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody(Student student)){
		Student student  = new Student();
		student.setId(student.getId());
		student.setName(student.getName());
		return student;
	}
}
