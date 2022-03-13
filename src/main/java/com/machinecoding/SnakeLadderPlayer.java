package com.machinecoding;

public class SnakeLadderPlayer extends Player{
    int mPlayerPosition;
	SnakeLadderPlayer(int playerId, String playerName){
		super(playerId, playerName);
		mPlayerPosition = 1;
	}
	
	void setPlayerPosition(int position){
		mPlayerPosition = position;
	}
	
	int getPlayerPosition(){
		return this.mPlayerPosition;
	}
}
