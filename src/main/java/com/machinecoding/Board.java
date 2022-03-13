package com.machinecoding;

public class Board {
	SnakeUtils mSnakeUtils;
	LadderUtils mLadderUtils;
	int mBoardSize;
	
	Board(SnakeUtils snakeUtils, LadderUtils ladderUtils){
		mSnakeUtils = snakeUtils;
		mLadderUtils = ladderUtils;
		mBoardSize = 100;
	}
	
	int getBoardSize(){
		return this.mBoardSize;
	}
	
	SnakeUtils getSnakeUtils(){
		return this.mSnakeUtils;
	}
	
	LadderUtils getLadderUtils(){
		return this.mLadderUtils;
	}
}
