package kr.or.dgit.jdbc_study2;

import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.jdbc_study2.dto.Student;
import kr.or.dgit.jdbc_study2.service.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	 private static StudentService service;

	   @BeforeClass
	   public static void setUpBeforeClass() throws Exception {
	      service = StudentService.getInstance();
	   }

	   @After
	   public void tearDown() throws Exception {
	      service = null;
	   }

	   @Test
	   public void testAFindAllStudents() {
	      List<Student> list = service.findAllStudents();
	      
	      //Assert.isNonEmpty(list);
	   }
	
	   @Test
	   public void testBFindAllStudents() {
	      List<Student> list = service.findAllStudents();
	      
	      //Assert.isNonEmpty(list);
	   }
}
