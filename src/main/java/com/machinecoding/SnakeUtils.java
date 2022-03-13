package com.machinecoding;

import java.util.ArrayList;

public class SnakeUtils {
    ArrayList<Snake> mSnakes;
	int mSnakeCnt;
	
	SnakeUtils(){
		mSnakes = new ArrayList<Snake>();
		mSnakeCnt = 0;
	}
	
	void addSnake(Snake snake){
		mSnakes.add(snake);
		mSnakeCnt = mSnakeCnt+1;
	}
	
	// return the tail of the snake if there is one at this position
	int checkSnake(int position){
		for(Snake snake: mSnakes){
			if(snake.getHead() == position){
				return snake.getTail();
			}
		}
		return 0;
	}
}
