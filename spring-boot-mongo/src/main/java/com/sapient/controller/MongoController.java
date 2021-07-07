package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.Inventory;
import com.sapient.interfaces.IMongo;

@RestController
public class MongoController {

	@Autowired
	IMongo mongo;
	
	
	@GetMapping("/inventory")
	public List<Inventory> getAllInventory() {
		return mongo.findAll();
	}
	
	
}
