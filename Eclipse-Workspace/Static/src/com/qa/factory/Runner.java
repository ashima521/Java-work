package com.qa.factory;

public class Runner {
	public static void main(String[] args) {
//		Box box = new Box("cardboard");
//		Box crate = new Box("wooden");
//		System.out.println(box.getMaterial());
//		System.out.println(crate.getMaterial());
		//System.out.println(Box.material);
		
		Box box = new Box(100);
		Box crate = new Box(600);
		for ( Box boxy: Box.boxes) {
			System.out.println(boxy.getVolume());
		}
	
	}
	}

