package com.qa.garage1;

public class Runner {
	public static void main(String[] args) {
	Car acar = new Car(20, false);
	acar.door();
	acar.setBrake(5);
	System.out.println(acar.getSpeed());
	System.out.println(acar.getBrake());
	}
    
	
     }
