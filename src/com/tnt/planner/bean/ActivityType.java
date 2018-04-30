package com.tnt.planner.bean;


public enum ActivityType {
	ADVENTURE ("Adventure"),
	LEISURE ("Leisure");

private final String name ; 
ActivityType(String name){
	this.name = name;
}
}