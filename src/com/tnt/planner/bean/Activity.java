package com.tnt.planner.bean;

public class Activity {
	private StringBuffer activity = new StringBuffer(100);
	private Location location = new Location();
	private ActivityType type;
	private float cost = 0.0f;
	public StringBuffer getActivity() {
		return activity;
	}
	public void setActivity(StringBuffer activity) {
		this.activity = activity;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ActivityType getType() {
		return type;
	}
	public void setType(ActivityType type) {
		this.type = type;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
