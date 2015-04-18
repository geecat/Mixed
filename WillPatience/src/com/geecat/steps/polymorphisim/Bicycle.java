package com.geecat.steps.polymorphisim;

public class Bicycle {

	private String gear;
	private String cadence;
	private String speed;

	

	public Bicycle(String startCadence, String startSpeed, String startGear) {
		this.gear = startGear;
		this.cadence = startCadence;
		this.speed = startSpeed;
	}



	public String getGear() {
		return gear;
	}



	public void setGear(String gear) {
		this.gear = gear;
	}



	public String getCadence() {
		return cadence;
	}



	public void setCadence(String cadence) {
		this.cadence = cadence;
	}



	public String getSpeed() {
		return speed;
	}



	public void setSpeed(String speed) {
		this.speed = speed;
	}



	public void printDescription(){
	    System.out.println("\nBike is " + "in gear " + this.gear
	        + " with a cadence of " + this.cadence +
	        " and travelling at a speed of " + this.speed + ". ");
	}

}
