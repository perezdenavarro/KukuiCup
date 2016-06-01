package com.ub.tfg.kukuicup.model;

import java.util.ArrayList;

import android.widget.ImageView;

public class Team {
	
	private int id;
	private String name;
	private ArrayList<User> userList;
	private int points;
	private int classification;
	private ImageView teamImg;
	
	
	
	public Team() {
		userList = new ArrayList<User>();
	}



	public Team(int id, String name) {
		this.id = id;
		this.name = name;
		userList = new ArrayList<User>();
	}



	public Team(int id, String name, ArrayList<User> userList, int points,
			int classification, ImageView teamImg) {
		this.id = id;
		this.name = name;
		this.userList = userList;
		this.points = points;
		this.classification = classification;
		this.teamImg = teamImg;
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public ArrayList<User> getUserList() {
		return userList;
	}



	public int getPoints() {
		return points;
	}



	public int getClassification() {
		return classification;
	}



	public ImageView getTeamImg() {
		return teamImg;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}



	public void setPoints(int points) {
		this.points = points;
	}



	public void setClassification(int classification) {
		this.classification = classification;
	}



	public void setTeamImg(ImageView teamImg) {
		this.teamImg = teamImg;
	}
	
	

}
