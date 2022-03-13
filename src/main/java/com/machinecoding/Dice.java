package com.machinecoding;

import java.util.Random;

public class Dice {
    static Random random = new Random();
	static int getDiceRoll(){
		return 1+random.nextInt(6);
	}
}
