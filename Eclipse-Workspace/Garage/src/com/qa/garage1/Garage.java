package com.qa.garage1;

import java.util.ArrayList;

public class Garage {

	 public static void main(String[] args) {
		 ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		 Vehicle car = new Car(20, true);
		 //Vehicle truck = new truck(20, true);
		 vehicles.add(new Car(20, true));
		 vehicles.stream().forEach(
				 vehicle -> System.out.println(vehicle.bill()));
	 }
}
