package com.qa.circus;

public class Elephant {

//	String species = "asian";
//	String colour = "grey";
//	int legs = 3;
	String species;
	String colour;
	int legs;
//
//public void haveMudBath(String paint) {
//	colour = paint;
//}	
/**  ~ gives documentation of the parameters
 * this creates an elephant
 * @param mySpecies this is the species
 * @param myColour this is the colour of the elephant
 * @param myLegs this is the elephant colour
 */
public Elephant(String mySpecies, String myColour, int myLegs) {
	
	species = mySpecies;
	colour = myColour;
	legs = myLegs;
	
		System.out.println("an elephant is born");
	}
}


