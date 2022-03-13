package com.machinecoding;

public class Move {
    int mMoveId;
	int mPlayerId;
	int mDiceRoll;
	int mPlayerPosition;

	Move(int moveId, int playerId, int position){
		mMoveId = moveId;
		mPlayerId = playerId;
		mPlayerPosition = position;
		mDiceRoll = Dice.getDiceRoll();
	}
	
	int getMoveDiceRoll(){
		return this.mDiceRoll;
	}
	
	int getPlayerId(){
		return this.mPlayerId;
	}
	
	void printMove(){
		System.out.println("Player Id: "+mPlayerId+" | Dice Roll: "+mDiceRoll+" | CurrentPos : "+mPlayerPosition);
	}
}
