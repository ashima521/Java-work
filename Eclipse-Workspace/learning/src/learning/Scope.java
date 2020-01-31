package learning;

public class Scope {
   
	static int number = 4;
	public static void main (String[] args) {
    int number = 6; // 'int' syntax creates new number variable
    System.out.println(number);
    printy();
    }   //loop variable takes priority over method and method takes priority over class
    
    public static void printy() {
	System.out.println(number); //method scope can only access within the curly bracket {}
}}