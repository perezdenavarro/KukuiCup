package com.ub.tfg.kukuicup.model;

import java.util.ArrayList;

import android.widget.ImageView;

public class Player extends User {
	
	private int points;
	private int ranking;
	private ArrayList<Badge> badgeList;
	private int level;
	private ImageView avatar;

	public Player() {
		badgeList = new ArrayList<Badge>();
	}

	public Player(int id, String name, String passwd) {
		super(id, name, passwd);
		badgeList = new ArrayList<Badge>();
	}

	public int getPoints() {
		return points;
	}

	public int getRanking() {
		return ranking;
	}

	public ArrayList<Badge> getListBadges() {
		return badgeList;
	}

	public int getLevel() {
		return level;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public void setListBadges(ArrayList<Badge> listBadges) {
		this.badgeList = listBadges;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ImageView getAvatar() {
		return avatar;
	}

	public void setAvatar(ImageView avatar) {
		this.avatar = avatar;
	}
	

}
