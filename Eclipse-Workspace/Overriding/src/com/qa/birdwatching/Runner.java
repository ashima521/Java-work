package com.qa.birdwatching;

public class Runner {
	public static void main (String[] args) {
	 Bird bird = new Bird();
	 bird.fly();
	 System.out.println(bird.getAltitude());
     
	 Penguin pingu = new Penguin();
	 pingu.fly();
	 System.out.println(pingu.getAltitude());
	 
//	 Bird bird2 = new Penguin();
//	 bird2.fly();
//	 
	}}
