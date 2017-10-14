package com.example.macbookpro.givvapp.model;

import java.util.List;

/**
 * Created by macbookpro on 10/14/17
 */

public class Charity {
	private String name;
	private String companyUrl;
	private Project currentProject;
	private List<Project> pastProjects;
	private List<String> imgUrls;

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
}
