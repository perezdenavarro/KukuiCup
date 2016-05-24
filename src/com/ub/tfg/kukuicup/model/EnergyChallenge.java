package com.ub.tfg.kukuicup.model;

public class EnergyChallenge extends Activity {
	
	private Badge badge;

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

}
