package com.ub.tfg.kukuicup.model;

public class SavingAction extends Activity {
	
	private int points;

	public SavingAction(int id, String name, String description, int points) {
		super(id, name, description);
		this.points = points;
		// TODO Auto-generated constructor stub
	}

	public SavingAction() {
		// TODO Auto-generated constructor stub
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
