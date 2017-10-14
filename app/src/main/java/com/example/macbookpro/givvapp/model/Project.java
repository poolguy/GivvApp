package com.example.macbookpro.givvapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by macbookpro on 10/14/17
 */

public class Project implements Parcelable{
	private double amountGoal;
	private double amountEarned;
	private String name;
	private String description;
	private List<String> imgUrls;
	private List<String> videoUrls;

	public Project(double amountGoal, double amountEarned, String name, String description, List<String> imgUrls, List<String> videoUrls) {
		this.amountGoal = amountGoal;
		this.amountEarned = amountEarned;
		this.name = name;
		this.description = description;
		this.imgUrls = imgUrls;
		this.videoUrls = videoUrls;
	}

	protected Project(Parcel in) {
		amountGoal = in.readDouble();
		amountEarned = in.readDouble();
		name = in.readString();
		description = in.readString();
		imgUrls = in.createStringArrayList();
		videoUrls = in.createStringArrayList();
	}

	public static final Creator<Project> CREATOR = new Creator<Project>() {
		@Override
		public Project createFromParcel(Parcel in) {
			return new Project(in);
		}

		@Override
		public Project[] newArray(int size) {
			return new Project[size];
		}
	};

	public double getAmountGoal() {
		return amountGoal;
	}

	public void setAmountGoal(double amountGoal) {
		this.amountGoal = amountGoal;
	}

	public double getAmountEarned() {
		return amountEarned;
	}

	public void setAmountEarned(double amountEarned) {
		this.amountEarned = amountEarned;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(List<String> imgUrls) {
		this.imgUrls = imgUrls;
	}

	public List<String> getVideoUrls() {
		return videoUrls;
	}

	public void setVideoUrls(List<String> videoUrls) {
		this.videoUrls = videoUrls;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeDouble(amountGoal);
		parcel.writeDouble(amountEarned);
		parcel.writeString(name);
		parcel.writeString(description);
		parcel.writeStringList(imgUrls);
		parcel.writeStringList(videoUrls);
	}
}
