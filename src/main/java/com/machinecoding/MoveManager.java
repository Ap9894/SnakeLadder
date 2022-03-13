package com.machinecoding;

import java.util.ArrayList;

public class MoveManager {
    
	ArrayList<Move> mMoves;
	SnakeUtils mSnakeUtils;
	LadderUtils mLadderUtils;
	int mMoveCnt;
	
	MoveManager(SnakeUtils snakeUtils, LadderUtils ladderUtils){
		mSnakeUtils = snakeUtils;
		mLadderUtils = ladderUtils;
		mMoves = new ArrayList<>();
		mMoveCnt = 0;
	}
	
	int makeMove(int playerId, int currPosition){
		Move currentMove = new Move(mMoveCnt, playerId, currPosition);
		mMoveCnt = mMoveCnt+1;
		mMoves.add(currentMove);
		
		// return players final position in this move
		int diceRoll = currentMove.getMoveDiceRoll();
		currPosition = currPosition + diceRoll;
		while(true){
			int isSnake = mSnakeUtils.checkSnake(currPosition);
			if(isSnake > 0){
				currPosition = isSnake;
				continue;
			}
			
			int isLadder = mLadderUtils.checkLadder(currPosition);
			if(isLadder > 0){
				currPosition = isLadder;
				continue;
			}
			break;
		}
		currentMove.printMove();
		return currPosition;
		
	}

	Move getLastMove(){
		if(mMoveCnt != 0) return mMoves.get(mMoveCnt-1);
		return null;
	}
}
