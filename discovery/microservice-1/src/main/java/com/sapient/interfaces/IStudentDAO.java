package com.sapient.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.sapient.entity.Student;


//DT: POJO, PK DT
@Service
public interface IStudentDAO extends JpaRepository<Student, String> {
	
	
	@Query(value="SELECT * FROM student WHERE fname = ?1", nativeQuery = true)
	public List<Student> getStudentByNameCustum(String fnamess);
	
}
