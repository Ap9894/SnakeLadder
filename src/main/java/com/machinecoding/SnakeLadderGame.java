package com.machinecoding;

import java.util.ArrayList;

// class SnakeLadderGameUtils{
	
// }

public class SnakeLadderGame extends Game {
    Board mBoard;
	ArrayList<SnakeLadderPlayer> mPlayers;
	
	SnakeLadderGame(Board board){
		mBoard = board;
		mPlayers = new ArrayList<SnakeLadderPlayer> ();
	}
	
	void addPlayer(SnakeLadderPlayer player){
		mPlayers.add(player);
	}
	
	void playGame(){
		// initialise MoveManager
		MoveManager moveManager = new MoveManager(mBoard.getSnakeUtils(), mBoard.getLadderUtils());
		while(true){
			int playerIdForMove = getPlayerIdForMove(moveManager);
			int finalPlayerPosition = moveManager.makeMove(playerIdForMove, getPlayerPositionForMove(playerIdForMove));
			if(finalPlayerPosition == mBoard.getBoardSize()) {
				System.out.println("Winner :" + playerIdForMove);
				break;
			}
			System.out.println("final pos :"+ finalPlayerPosition);
			updatePlayerPosition(finalPlayerPosition, playerIdForMove);
		}
	}

	void updatePlayerPosition(int position, int playerId){
		mPlayers.get(playerId-1).setPlayerPosition(position);
	}
	
	// utility method
	int getPlayerIdForMove(MoveManager moveManager){
		Move lastMove = moveManager.getLastMove();
		if(lastMove == null) return 1;
		int lastPlayerId = lastMove.getPlayerId();
		if(lastPlayerId != mPlayers.size()) return 1+lastPlayerId;
		return 1;
	}
	
	int getPlayerPositionForMove(int playerIdForMove){
		return mPlayers.get(playerIdForMove-1).getPlayerPosition();
	}
}
