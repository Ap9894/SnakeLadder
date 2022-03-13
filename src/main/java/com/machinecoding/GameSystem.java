package com.machinecoding;

import java.util.ArrayList;

public class GameSystem {
    SnakeLadderGame mGame;
	Board mBoard;
	SnakeUtils mSnakeUtils;
	LadderUtils mLadderUtils;
	
	GameSystem(){
		mSnakeUtils = new SnakeUtils();
		mLadderUtils = new LadderUtils();
	}	
	
	void initialiseSnakeUtils(ArrayList<Integer> snakeHead, ArrayList<Integer> snakeTail){
		int snakeCnt = snakeHead.size();
		for(int i=0;i<snakeCnt;i++){
			mSnakeUtils.addSnake(new Snake(i+1, snakeHead.get(i), snakeTail.get(i)));
		}
	}
	
	void initialiseLadderUtils(ArrayList<Integer> ladderStart, ArrayList<Integer> ladderEnd){
		int ladderCnt = ladderStart.size();
		for(int i=0;i<ladderCnt;i++){
			mLadderUtils.addLadder(new Ladder(i+1, ladderStart.get(i), ladderEnd.get(i)));
		}
	}
	
	void initialisePlayers(ArrayList<String> playerNames){
		int playersCnt = playerNames.size();
		for(int i=0;i<playersCnt;i++){
			mGame.addPlayer(new SnakeLadderPlayer(i+1,playerNames.get(i)));
		}
	}
	
	void initialiseGame(ArrayList<Integer> snakeHead, ArrayList<Integer> snakeTail, ArrayList<Integer> ladderStart,
						ArrayList<Integer> ladderEnd, ArrayList<String> playerNames){
		
		initialiseSnakeUtils(snakeHead, snakeTail);
		initialiseLadderUtils(ladderStart, ladderEnd);
		
		// initialise SnakeLadderGame
		mBoard = new Board(mSnakeUtils, mLadderUtils);
		mGame = new SnakeLadderGame(mBoard);
		
		initialisePlayers(playerNames);
	}
	
	void startGamePlay(){
		mGame.playGame();
	}
}
