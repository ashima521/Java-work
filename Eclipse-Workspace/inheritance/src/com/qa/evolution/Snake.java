package com.qa.evolution;

public class Snake {
	private short length;
	public void big() {
		this.length++;
	}
	public short getLength() {
		return length;
	}

	public void setLength(short length) {
		this.length = length;
	}

	public void bite() {
		System.out.println("ouch!");
	}
}
