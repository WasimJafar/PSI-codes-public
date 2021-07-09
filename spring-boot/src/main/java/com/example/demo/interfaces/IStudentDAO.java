package com.example.demo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

//DT: POJO, PK DT
@Service
public interface IStudentDAO extends JpaRepository<Student, String> {
	
	public List<Student> findByFname(String fname);
	
	public List<Student> findByFnameAndLname(String fname, String lname);
	
	@Query(value="SELECT * FROM student a NATURAL JOIN marks b WHERE a.id = b.id", nativeQuery = true)
	public List<String> selectJoinStudentAndMarks();
	
//	@Query(value="SELECT * FROM student WHERE fname = ?1", nativeQuery = true)
//	public List<Student> getStudentByNameCustum(String fnamess);
	
}
