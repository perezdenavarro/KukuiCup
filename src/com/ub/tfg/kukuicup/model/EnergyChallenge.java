package com.ub.tfg.kukuicup.model;

public class EnergyChallenge extends Activity {
	
	private Badge badge;
	private int state;

	public EnergyChallenge() {
		// TODO Auto-generated constructor stub
	}

	public EnergyChallenge(int id, String name, String description) {
		super(id, name, description);
		// TODO Auto-generated constructor stub
	}

	public Badge getBadge() {
		return badge;
	}

	public void setBadge(Badge badge) {
		this.badge = badge;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	

}
