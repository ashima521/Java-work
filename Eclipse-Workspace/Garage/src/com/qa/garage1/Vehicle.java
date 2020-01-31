package com.qa.garage1;

public abstract class Vehicle {
	private int speed;

	public Vehicle(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	private int brake;
	public void slow(int brake) {
		this.brake = brake;}

	public int getBrake() {
		return brake;
	}

	public void setBrake(int brake) {
		this.brake = brake;
	}
	
	public abstract float bill();
	

}