package com.machinecoding;

public abstract class Player {
    int mPlayerId;
	String mPlayerName;
	
	Player(int playerId, String playerName){
		mPlayerId = playerId;
		mPlayerName = playerName;
	}
}
