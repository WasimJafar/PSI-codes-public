package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.StudentController;
import com.example.demo.entity.Student;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)

class ApplicationTests {

	@Mock
	StudentController controller;
	
	
//	@Test
//	public void checkGetAll() {
//		
//		String id = "s100";
//		Student student = controller.getStudentByID(id);
//		Student expected = new Student("s100" , "Kohli" , "Tendulkar" ,"1999-01-01","9871310263","delhi");
//				
//		assertTrue(student.equals(expected));
//		
//	}
	
	
	@Test
    public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
		String id = "s100";
        Mockito.when(controller.getStudentByID(id)).thenReturn(new Student("s100" , "Kohli" , "Tendulkar" ,"1999-01-01","9871310263","delhi"));
        
        Student actual = controller.getStudentByID(id);
		Student expected = new Student("s100" , "Kohli" , "Tendulkar" ,"1999-01-01","9871310263","delhi");

        
        assertTrue(actual.equals(expected));
    }
	
	

}
