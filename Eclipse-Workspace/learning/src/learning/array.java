package learning;

import java.util.ArrayList; //ctrl + shift + O
import java.util.List;
import java.util.stream.Collectors;

public class array {
	public static void main(String[] args) {
//		String name = "James";
//		String [] row2 = {name, "ashima", "jess"};
//		row2[2]= "nisha";
//		System.out.println(row2[2]);
// 		System.out.println(row2);   //provides memory location of the object
//
//        String [] row6 = {"doug", "josh", "sam", "jeevan"};
//        String [] row5 = {"Nisha", "laurence", "ashima"};
//        String [] row7 = {"mumba", "prem"}; 
		
//   Multidimensional  
//        String [][] room = {row5, row6, row7};
//        System.out.println(room[1][1] + " " + room[0][2]);
//        System.out.println(room[0][2]);
//        room[0][1] = "jess";
//        System.out.println(row5[1]);
		
//   ArrayList	
//        ArrayList<String> row5 = new ArrayList<String>();
//        System.out.println(row5.add("L"));
//        System.out.println(row5.size());
//        System.out.println(row5.add("N"));
//        System.out.println(row5.size());
//        System.out.println(row5.add("J"));
//        System.out.println(row5.size());
//        System.out.println(row5.add("A"));
//        System.out.println(row5.size());
//        System.out.println(row5.add("H"));
//        System.out.println(row5.size());
//        System.out.println(row5.remove("J"));    //remove(int index) or remove(object object)
//        System.out.println(row5);
		
//   Using for loop for array (get by index)
		
//		int[] nums = new int [3];
//		nums[0] = 8;
//		nums[1] = 2;
//		nums[2] = 15;
		
	//	for (int i = 0; i < nums.length; i++) {
				//System.out.println((nums[i]));
		//	}
        // for each 
	    // for (int num: nums) {
		// System.out.println(num);
//	}}}

				
		
//   Using for loop for arraylist(get by index)
		
		//ArrayList<Integer> nums = new ArrayList<Integer>();
	    //nums.add(8);
		//nums.add(2);
	    //nums.add(15);	
	    
	//    for (int i = 0; i < nums.size(); i++) {
	//		System.out.println((nums.get(i)));
		
	// for each    
     //  for (Integer num: nums) {
	   //   System.out.println(num);}  
	
		ArrayList<String> names = new ArrayList<String>();
	    names.add("Jack");
		names.add("James");
	    names.add("Tyler");

	   //names.stream().forEach(num -> System.out.println(num));       
	   //List<String> passed = names.stream().filter(name -> !(names.equals("James"))).collect(Collectors.toList()); 
	   //System.out.println(passed.size());
	   
	   List<String> passed = names.stream().filter(name -> !(name.equals("James"))).map(name -> name + " is trash").collect(Collectors.toList()); 
	   System.out.println(passed);
	   
	       }}
