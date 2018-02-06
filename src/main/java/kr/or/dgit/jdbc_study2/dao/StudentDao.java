package kr.or.dgit.jdbc_study2.dao;

import java.util.List;

import kr.or.dgit.jdbc_study2.dto.Student;

public interface StudentDao {
	Student findStudentById(int stdId);
	void insertStudent(Student student);
	void deleteStudent(int stdId);
	List<Student> findAllStudents();
}
