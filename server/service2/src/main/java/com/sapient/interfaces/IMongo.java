package com.sapient.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sapient.entity.Inventory;

@Repository
public interface IMongo extends MongoRepository<Inventory, String> {
		
}
