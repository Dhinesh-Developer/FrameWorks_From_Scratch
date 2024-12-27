package com.hib.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class student {
	
	public student() {
		super();
	}
	@Override
	public String toString() {
		return "student [e_id=" + e_id + ", e_name=" + e_name + ", email=" + email + ", dept=" + dept + ", salary="
				+ salary + ", sd=" + sd + "]";
	}
	public student(String e_name, String email, String dept, int salary) {
		super();
		this.e_name = e_name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
	}
	public student(int e_id, String e_name, String email, String dept, int salary) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Id // for primary key.
	@GeneratedValue(strategy = GenerationType.AUTO)  // mention for auto increment.
	@Column(name="e_id")
	private int e_id;
	@Column(name="e_name")
	private String e_name;
	@Column(name="email")
	private String email;
	@Column(name="dept")
	private String dept;
	@Column(name="salary")
	private int salary;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="edId")
	private studentDetails sd;


	public studentDetails getSd() {
		return sd;
	}
	public void setSd(studentDetails sd) {
		this.sd = sd;
	}
	public student(int e_id, String e_name, String email, String dept, int salary, studentDetails sd) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
		this.sd = sd;
	}
	
	
}
