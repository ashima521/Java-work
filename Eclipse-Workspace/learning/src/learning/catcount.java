package learning;

public class catcount {
public static void main(String[] args) {
	int catcount = 0;
	boolean notenoughcats = true;
	
	while (notenoughcats) {
		catcount++;
		System.out.println("Another cat");
		
		 
		if (catcount > 10)
			notenoughcats = false;}
	System.out.println( " Too many cats what do i do");


//for loop used when we know the amount
//initialisation
//int catcount1 = 0;
//for (;catcount1 < 10; catcount1++) {
	for (int catcount1 = 0; catcount1 < 10; catcount1++) {
	System.out.println("another cat");
	}
System.out.println("too many cats");}}

//different method
//while (catcount < 10) {
	//System.out.println("Another cat");
	//catcount++;
//}
//System.out.println( " Too many cats what do i do");
