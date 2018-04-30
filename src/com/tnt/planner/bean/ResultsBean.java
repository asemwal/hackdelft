package com.tnt.planner.bean;

import java.util.ArrayList;

public class ResultsBean {
	ArrayList<Hotel> hotel = new ArrayList<>();
	ArrayList<TravelItenary> travel = new ArrayList<>();
	ArrayList<Activity> activity = new ArrayList<>();
	public ArrayList<Hotel> getHotel() {
		return hotel;
	}
	public void setHotel(ArrayList<Hotel> hotel) {
		this.hotel = hotel;
	}
	public ArrayList<TravelItenary> getTravel() {
		return travel;
	}
	public void setTravel(ArrayList<TravelItenary> travel) {
		this.travel = travel;
	}
	public ArrayList<Activity> getActivities() {
		return activity;
	}
	public void setActivities(ArrayList<Activity> activities) {
		this.activity = activities;
	}
	
	

}
