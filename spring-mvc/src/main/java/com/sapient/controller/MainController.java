package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.dao.StudentDAO;
import com.sapient.entity.Student;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public String getNextPage() {
		return "NewFile";
	}

	@GetMapping("/getstudent")
	public String getAllUser(Model model) {
		StudentDAO dao;
		try {
			
			dao = new StudentDAO();
			List<Student> students =  dao.getAllStudent();
//			students.forEach(System.out::println);
			
			model.addAttribute("students",students);
			
			return "student";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
