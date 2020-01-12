package com.ibm.demo;

public class User {

	

	private String Id;
	private String Firstname;
	private String Lastname;
	private String Dept;
	private String Title;
	private String Role;
	
	
	public User(String id, String firstname, String lastname, String dept, String title, String role) {
		super();
		Id = id;
		Firstname = firstname;
		Lastname = lastname;
		Dept = dept;
		Title = title;
		Role = role;
	}





	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getId() {
		return Id;
	}




	public void setId(String id) {
		Id = id;
	}




	public String getFirstname() {
		return Firstname;
	}




	public void setFirstname(String firstname) {
		Firstname = firstname;
	}




	public String getLastname() {
		return Lastname;
	}




	public void setLastname(String lastname) {
		Lastname = lastname;
	}




	public String getDept() {
		return Dept;
	}




	public void setDept(String dept) {
		Dept = dept;
	}




	public String getTitle() {
		return Title;
	}




	public void setTitle(String title) {
		Title = title;
	}




	public String getRole() {
		return Role;
	}




	public void setRole(String role) {
		Role = role;
	}
	
	
	



	
}
