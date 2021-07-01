package com.dao;

import java.sql.*;
import java.util.List;

import com.constant.Constants;
import com.to.User;

public class UserDao {

	public UserDao() {
		
	}
	
	
	
	public void getUser(User user) throws Exception {
		
		Connection connection = Connectivity.getConnection();

		String query = "select * from user where userid = ? and userpassword = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			user.setStatus(resultSet.getString(3));
			return ;
		}
		
		else {
			throw new Exception("Username and passowrd deosnot match");
		}
		
	}
	
}
