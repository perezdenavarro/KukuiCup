package com.ub.tfg.kukuicup.model;

public class ScienceVideo {
	private int id;
	private String title;
	private String description;
	private String URL;
	
	public ScienceVideo() {
	}

	public ScienceVideo(int id, String title, String description, String uRL) {
		this.id = id;
		this.title = title;
		this.description = description;
		URL = uRL;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getURL() {
		return URL;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

}
