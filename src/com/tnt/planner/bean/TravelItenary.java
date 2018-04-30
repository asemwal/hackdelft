package com.tnt.planner.bean;

public class TravelItenary {
	private StringBuffer mode = new StringBuffer("10");
	private float cost = 0.0f;
	private Duration duration = new Duration();
	private Location from = new Location();
	private Location to = new Location();
	
	public Location getFrom() {
		return from;
	}
	public void setFrom(Location from) {
		this.from = from;
	}
	public Location getTo() {
		return to;
	}
	public void setTo(Location to) {
		this.to = to;
	}
	public StringBuffer getMode() {
		return mode;
	}
	public void setMode(StringBuffer mode) {
		this.mode = mode;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	

}
