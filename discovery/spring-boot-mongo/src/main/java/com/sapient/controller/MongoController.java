package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.entity.Inventory;
import com.sapient.interfaces.IMongo;

@RestController
@RequestMapping("/inventory")
public class MongoController {

	@Autowired
	IMongo mongo;
	
	@GetMapping("/get")
	public List<Inventory> getAllInventory() {
		return mongo.findAll();
	}
	
	@PostMapping("/add")
	public Inventory addInventory(@RequestBody Inventory inventory) {
//		mongo.insert(inventory);
		Inventory savedInventory = mongo.save(inventory);
		
		return savedInventory != null ? savedInventory : null;
	}
	
	
	
}
