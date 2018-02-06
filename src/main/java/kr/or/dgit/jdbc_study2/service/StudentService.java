package kr.or.dgit.jdbc_study2.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import kr.or.dgit.erp_application.jdbc.DBCon;
import kr.or.dgit.jdbc_study2.dao.StudentDao;
import kr.or.dgit.jdbc_study2.dto.Student;

public class StudentService implements StudentDao{

	private final static StudentService instance = new StudentService();

	   public static StudentService getInstance() {
	      return instance;
	   }

	   
	   private StudentService() {
	      // TODO Auto-generated constructor stub
	   }


	   @Override
	   public Student findStudentById(int studId) {
	      // TODO Auto-generated method stub
	      return null;
	   }

	   @Override
	   public void insertStudent(Student student) {
	      // TODO Auto-generated method stub

	   }

	   @Override
	   public void deleteStudent(int studId) {
	      // TODO Auto-generated method stub

	   }

	   @Override
	   public List<Student> findAllStudents() {
	      List<Student> lists = null;
	      Connection con = DBCon.getInstance().getConnection();
	      String sql = "select stud_id, name, email, dob from student";
	      try(PreparedStatement pstmt = con.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()){
	         if(!rs.next()) {
	            return Collections.emptyList();
	         }
	         lists = new ArrayList<>();
	         do {
	            lists.add(getStudent(rs));
	         }while(rs.next());
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return lists;
	   }


	   private Student getStudent(ResultSet rs) throws SQLException {
	      int studId = rs.getInt("stud_id");
	      String name = rs.getString("name");
	      String email = rs.getString("email");
	      Date dob = rs.getDate("dob");
	      return new Student(studId, name, email, dob);
	   }
}
