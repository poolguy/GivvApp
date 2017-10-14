package com.example.macbookpro.givvapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by macbookpro on 10/14/17
 */

public class Donation implements Parcelable {
	private Date donationDate;
	private double amount;


	public Donation(Date donationDate, double amount) {
		this.donationDate = donationDate;
		this.amount = amount;
	}

	protected Donation(Parcel in) {
		amount = in.readDouble();
	}

	public static final Creator<Donation> CREATOR = new Creator<Donation>() {
		@Override
		public Donation createFromParcel(Parcel in) {
			return new Donation(in);
		}

		@Override
		public Donation[] newArray(int size) {
			return new Donation[size];
		}
	};

	public Date getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeDouble(amount);
	}
}
