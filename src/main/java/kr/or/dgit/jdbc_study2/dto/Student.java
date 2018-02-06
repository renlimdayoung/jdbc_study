package kr.or.dgit.jdbc_study2.dto;

import java.util.Date;

public class Student {
	private int stdId;
	private String name;
	private String email;
	private Date dob;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stdId, String name, String email, Date dob) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return String.format("Student [stdId=%s, name=%s, email=%s, dob=%s]", stdId, name, email, dob);
	}

}
