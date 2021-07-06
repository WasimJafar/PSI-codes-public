package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.dao.ProductDao;
import com.sapient.dao.StudentDAO;
import com.sapient.entity.Product;
import com.sapient.entity.Student;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public String getNextPage() {
		return "NewFile";
	}
	
	@RequestMapping("/add-product")
	public String getAddProductPage() {
		return "add-product";
	}
	
	@RequestMapping("/delete-product")
	public String getDeletePage() {
		return "delete-product";
	}

	@GetMapping("/getstudent")
	public String getAllUser(Model model) {
		StudentDAO dao;
		try {
			
			dao = new StudentDAO();
			List<Student> students =  dao.getAllStudent();
			
			model.addAttribute("students",students);
			
			return "student";
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    System.out.println("Product add : " + product);
		ProductDao dao;
		try {
			dao = new ProductDao();
			dao.insertProduct(product);

			return "NewFile";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	    return "error";
	}
	

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteProduct(@ModelAttribute("product") Product product) {
	    System.out.println("Product delete: " + product);
		ProductDao dao;
		try {
			dao = new ProductDao();
			dao.deleteProduct(product);
			
			return "NewFile";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	    return "error";
	}
	

}
