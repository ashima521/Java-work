package com.qa.factory;

import java.util.ArrayList;

public class Box {

//	private String material;
//
//	public Box(String material) {
//		this.material = material;
//	}
//
//	public String getMaterial() {
//		return material;
//	}
//
//	public void setMaterial(String material) {
//		this.material = material;
//	}

	public static ArrayList<Box> boxes = new ArrayList<Box>();
	private int volume;

	public Box(int volume) {
		this.volume = volume;
		boxes.add(this);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	}
