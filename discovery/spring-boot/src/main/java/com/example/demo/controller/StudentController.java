package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.interfaces.IStudentDAO;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	IStudentDAO studentDAO;
	
	@GetMapping(value = "/")
	public List<Student> getAllStudent() {
		return studentDAO.findAll();
	}
	
	@GetMapping(value = "/id/{id}")
	public Optional<Student> getStudentByID(@PathVariable String id) {
		return studentDAO.findById(id);
	}
	
	@GetMapping(value = "/fname/{fname}")
	public List<Student> getStudentByFname(@PathVariable String fname) {
		return studentDAO.findByFname(fname);
	}
	
	@PostMapping(value = "/addstudent")
	public Student saveStudent(@RequestBody Student student) {
		return studentDAO.save(student);
	}
	
	@DeleteMapping(value = "/deletestudent/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentDAO.deleteById(id);
	}
	
	@GetMapping(value = "/name/{fname}/{lname}")
	public List<Student> getStudentByName(@PathVariable String fname, @PathVariable String lname) {
		return studentDAO.findByFnameAndLname(fname, lname);
	}
	
	@GetMapping(value = "/join")
	public List<String> getStudentMarksJoin() {
		return studentDAO.selectJoinStudentAndMarks();
	}
	
	
//	@GetMapping(value = "/get/{fname}")
//	public List<Student> getStudent(@PathVariable String fname) {
//		return studentDAO.getStudentByNameCustum(fname);
//	}
	
	
	
	
	
}
