package com.tnt.planner.bean;

public class Review {
	private StringBuffer comment = new StringBuffer("");
	public StringBuffer getComment() {
		return comment;
	}
	public void setComment(StringBuffer comment) {
		this.comment = comment;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	private float score = 0.0f;
	
}
