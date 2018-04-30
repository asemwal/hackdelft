package com.tnt.planner.bean;

import java.util.ArrayList;

public class Hotel {
	private StringBuffer hotelName = new StringBuffer(100);
	private float price = 0.0f;
	private Location location = new Location();
	private Review review = new Review();
	
	public StringBuffer getHotelName() {
		return hotelName;
	}
	public void setHotelName(StringBuffer hotelName) {
		this.hotelName = hotelName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	
			

}
