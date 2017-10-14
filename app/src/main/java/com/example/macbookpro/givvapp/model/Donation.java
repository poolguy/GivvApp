package com.example.macbookpro.givvapp.model;

import java.util.Date;

/**
 * Created by macbookpro on 10/14/17
 */

public class Donation {
	private Date donationDate;
	private double amount;

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
}
