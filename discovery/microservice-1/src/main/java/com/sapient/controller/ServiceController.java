package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.Student;
import com.sapient.interfaces.IStudentDAO;


@RestController
@RequestMapping("/student")
public class ServiceController {
	
	@Autowired
	IStudentDAO iStudentDAO;
	
	@GetMapping(value = "/get/{fname}")
	public List<Student> getStudent(@PathVariable String fname) {
		return iStudentDAO.getStudentByNameCustum(fname);
	}
	
}
