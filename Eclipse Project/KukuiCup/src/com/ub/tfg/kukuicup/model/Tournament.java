package com.ub.tfg.kukuicup.model;

import java.util.ArrayList;

public class Tournament {
	
	private String name;
	private int id;
	private ArrayList<Level> levelList;
	private ArrayList<Team> teamList;
	private ArrayList<User> userList;
	
	public Tournament() {
		levelList = new ArrayList<Level>();
		teamList = new ArrayList<Team>();
		userList = new ArrayList<User>();
	}
	
	

	public Tournament(String name, int id) {
		this.name = name;
		this.id = id;
		levelList = new ArrayList<Level>();
		teamList = new ArrayList<Team>();
		userList = new ArrayList<User>();		
	}

	
	public Tournament(String name, int id, ArrayList<Level> levelList,
			ArrayList<Team> teamList, ArrayList<User> userList) {
		this.name = name;
		this.id = id;
		this.levelList = levelList;
		this.teamList = teamList;
		this.userList = userList;
	}



	public String getName() {
		return name;
	}



	public int getId() {
		return id;
	}



	public ArrayList<Level> getLevelList() {
		return levelList;
	}



	public ArrayList<Team> getTeamList() {
		return teamList;
	}



	public ArrayList<User> getUserList() {
		return userList;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setLevelList(ArrayList<Level> levelList) {
		this.levelList = levelList;
	}



	public void setTeamList(ArrayList<Team> teamList) {
		this.teamList = teamList;
	}



	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	

}
