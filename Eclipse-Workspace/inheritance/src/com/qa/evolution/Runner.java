package com.qa.evolution;

public class Runner {
	public static void main(String[] args) {
		Snake kobe = new Snake();
		kobe.bite();
		kobe.getLength();
		System.out.println(kobe.getLength());
		RattleSnake leBron = new RattleSnake();
		leBron.bite();
		leBron.getLength();
		

		RattleSnake james = new RattleSnake();
		BlackMamba tyler = new BlackMamba();
		Snake a = (Snake) james;
		Snake b = (Snake) tyler;
		
		//ArrayList<Snake> Snakes = new ArrayList<Snake>();
		
		RattleSnake still;james = (RattleSnake) a;
		//BlackMamba still; tyler = (BlackMamba) b; //error

	}}

