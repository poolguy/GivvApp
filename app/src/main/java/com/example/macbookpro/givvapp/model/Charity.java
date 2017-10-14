package com.example.macbookpro.givvapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by macbookpro on 10/14/17
 */

public class Charity implements Parcelable{
	private String name;
	private String companyUrl;
	private Project currentProject;
	private List<Project> pastProjects;
	private List<String> imgUrls;

	protected Charity(Parcel in) {
		name = in.readString();
		companyUrl = in.readString();
		imgUrls = in.createStringArrayList();
	}

	public static final Creator<Charity> CREATOR = new Creator<Charity>() {
		@Override
		public Charity createFromParcel(Parcel in) {
			return new Charity(in);
		}

		@Override
		public Charity[] newArray(int size) {
			return new Charity[size];
		}
	};

	public Charity(String name, String companyUrl, Project currentProject, List<Project> pastProjects, List<String> imgUrls) {
		this.name = name;
		this.companyUrl = companyUrl;
		this.currentProject = currentProject;
		this.pastProjects = pastProjects;
		this.imgUrls = imgUrls;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyUrl() {
		return companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public Project getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(Project currentProject) {
		this.currentProject = currentProject;
	}

	public List<Project> getPastProjects() {
		return pastProjects;
	}

	public void setPastProjects(List<Project> pastProjects) {
		this.pastProjects = pastProjects;
	}

	public List<String> getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(List<String> imgUrls) {
		this.imgUrls = imgUrls;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeString(name);
		parcel.writeString(companyUrl);
		parcel.writeStringList(imgUrls);
	}
}
