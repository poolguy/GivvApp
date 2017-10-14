package com.example.macbookpro.givvapp.model;

import java.util.List;

/**
 * Created by macbookpro on 10/14/17
 */

public class Employer {
	List<Employee> employees;
	List<Project> currentProjects;
	List<Project> pastProjects;
	String name;
	String imgUrl;
	String address;
	String phoneNumber;
	String email;
	String id;

	public Employer(List<Employee> employees, List<Project> currentProjects, List<Project> pastProjects, String name, String imgUrl, String address, String phoneNumber, String email, String id) {
		this.employees = employees;
		this.currentProjects = currentProjects;
		this.pastProjects = pastProjects;
		this.name = name;
		this.imgUrl = imgUrl;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.id = id;
	}

	public Employer() {
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Project> getCurrentProjects() {
		return currentProjects;
	}

	public void setCurrentProjects(List<Project> currentProjects) {
		this.currentProjects = currentProjects;
	}

	public List<Project> getPastProjects() {
		return pastProjects;
	}

	public void setPastProjects(List<Project> pastProjects) {
		this.pastProjects = pastProjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
