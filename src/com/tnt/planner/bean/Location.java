package com.tnt.planner.bean;

public class Location {
	public StringBuffer getLine1() {
		return line1;
	}
	public void setLine1(StringBuffer line1) {
		this.line1 = line1;
	}
	public StringBuffer getLine2() {
		return line2;
	}
	public void setLine2(StringBuffer line2) {
		this.line2 = line2;
	}
	public StringBuffer getPostCoder() {
		return postCoder;
	}
	public void setPostCoder(StringBuffer postCoder) {
		this.postCoder = postCoder;
	}
	public StringBuffer getCity() {
		return city;
	}
	public void setCity(StringBuffer city) {
		this.city = city;
	}
	public StringBuffer getState() {
		return state;
	}
	public void setState(StringBuffer state) {
		this.state = state;
	}
	public StringBuffer getCountry() {
		return country;
	}
	public void setCountry(StringBuffer country) {
		this.country = country;
	}
	private StringBuffer line1 = new StringBuffer(100);
	private StringBuffer line2 = new StringBuffer(100);
	private StringBuffer postCoder = new StringBuffer(10);
	private StringBuffer city = new StringBuffer(100);
	private StringBuffer state = new StringBuffer(100);
	private StringBuffer country = new StringBuffer(100);
	
}
