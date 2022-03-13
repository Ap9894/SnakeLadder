package com.machinecoding;

import java.util.ArrayList;

public class LadderUtils {
    ArrayList<Ladder> mLadders;
	LadderUtils(){
		mLadders = new ArrayList<Ladder>();
	}
	
	void addLadder(Ladder ladder){
		mLadders.add(ladder);
	}
	
	int checkLadder(int position){
		for(Ladder ladder: mLadders){
			if(ladder.getStart() == position){
				return ladder.getEnd();
			}
		}
		return 0;
	}
}
