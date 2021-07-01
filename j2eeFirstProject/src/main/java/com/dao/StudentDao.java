package com.dao;

import java.sql.*;
import java.util.*;

import com.constant.Constants;
import com.to.*;

public class StudentDao {

	public List<Student> getAllStudent() throws Exception {

		Connection connection = Connectivity.getConnection();
		// constant or resources

		PreparedStatement preparedStatement = connection.prepareStatement(Constants.GET_ALL_STUDENT_QUERY);

		ResultSet resultSet = preparedStatement.executeQuery();

		List<Student> students = new ArrayList<>();

		while (resultSet.next()) {
			students.add(new Student(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
		}
		
		return students;
	}
	
	
	public void insertStudent(Student student) throws Exception {
		Connection connection = Connectivity.getConnection();
		// constant or resources
//		System.out.println(student);
		PreparedStatement preparedStatement = connection.prepareStatement(Constants.SAVE_STUDENT);

		preparedStatement.setString(1, student.getId());
		preparedStatement.setString(2, student.getFname());
		preparedStatement.setString(3, student.getLname());
		preparedStatement.setString(4, student.getDob());
		preparedStatement.setString(5, student.getArea());
		preparedStatement.setString(6, student.getPhoneNo());
		
		preparedStatement.executeUpdate();
		
		
		
	}
	

}














