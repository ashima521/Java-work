package learning;

public class learning {
	//public static void main (String[] args){
		//isdivisibleby(4,2);
	    //isdivisibleby(50,6);
 //}
	//public static void isdivisibleby(int number, int divider){ 
//		int num = 37;
		//System.out.println(number % divider == 0);}

	
	public static void main (String[] args){
		int a = 10;
	    int b =3;
	    
	    System.out.println("is" + a + "divisible by" + b + ":" + isdivisible(a,b)); 
	    
	    if(isdivisible(a,b)) {
	    	System.out.println("is divisible");}
	    else 
	    	System.out.println("is not divisible");}
	    
	   
	public static boolean isdivisible(int number, int divider){ 
//		int num = 37;
		return number % divider == 0;
 }}

