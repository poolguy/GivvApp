package com.example.macbookpro.givvapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by macbookpro on 10/14/17
 */

public class Employee implements Parcelable{
	private String id;
	private String fName;
	private String lName;
	private List<Project> pastProjects;
	private Project currentProject;
	private String email;
	private String password;
	private List<Donation> donations;
	double amountToDonate;

	public Employee(String id, String fName, String lName, List<Project> pastProjects, Project currentProject, String email, String password, List<Donation> donations, double amountToDonate) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.pastProjects = pastProjects;
		this.currentProject = currentProject;
		this.email = email;
		this.password = password;
		this.donations = donations;
		this.amountToDonate = amountToDonate;
	}

	protected Employee(Parcel in) {
		id = in.readString();
		fName = in.readString();
		lName = in.readString();
		email = in.readString();
		password = in.readString();
		donations = in.createTypedArrayList(Donation.CREATOR);
		amountToDonate = in.readDouble();
	}

	public static final Creator<Employee> CREATOR = new Creator<Employee>() {
		@Override
		public Employee createFromParcel(Parcel in) {
			return new Employee(in);
		}

		@Override
		public Employee[] newArray(int size) {
			return new Employee[size];
		}
	};

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeString(id);
		parcel.writeString(fName);
		parcel.writeString(lName);
		parcel.writeString(email);
		parcel.writeString(password);
		parcel.writeTypedList(donations);
		parcel.writeDouble(amountToDonate);
	}
}
