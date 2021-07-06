package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.sapient.entity.Product;

public class ProductDao {

	private static Connection connection;

	public ProductDao() throws Exception {
		connection = Connectivity.getConnection();
	}

	public void insertProduct(Product product) throws Exception {

		String query = "insert into product (name, madein, brand, price) values (?,?,?,?)";
		System.out.println(query);
		PreparedStatement ps = connection.prepareStatement(query);

		ps.setString(1, product.getName());
		ps.setString(2, product.getMadeIn());
		ps.setString(3, product.getBrand());
		ps.setString(4, product.getPrice());

		ps.executeUpdate();

	}
	
	
	public void deleteProduct(Product product) throws Exception {

		String query = "delete from product where name = ?";
		
		System.out.println(query);
		PreparedStatement ps = connection.prepareStatement(query);

		ps.setString(1, product.getName());

		ps.executeUpdate();

	}

}
