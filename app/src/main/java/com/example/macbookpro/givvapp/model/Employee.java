package com.example.macbookpro.givvapp.model;

import java.util.List;

/**
 * Created by macbookpro on 10/14/17
 */

public class Employee {
	private String id;
	private String fName;
	private String lName;
	private List<Project> pastProjects;
	private Project currentProject;
	private String email;
	private String password;
	private List<Donation> donations;
	double amountToDonate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public List<Project> getPastProjects() {
		return pastProjects;
	}

	public void setPastProjects(List<Project> pastProjects) {
		this.pastProjects = pastProjects;
	}

	public Project getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(Project currentProject) {
		this.currentProject = currentProject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	public double getAmountToDonate() {
		return amountToDonate;
	}

	public void setAmountToDonate(double amountToDonate) {
		this.amountToDonate = amountToDonate;
	}
}
