package com.machinecoding;

public class Ladder {
    int mLadderId;
	int mStartPos, mEndPos;
	Ladder(int id, int startPos, int endPos){
		mLadderId = id;
		mStartPos = startPos;
		mEndPos = endPos;
	}
	
	int getStart(){
		return this.mStartPos;
	}
	
	int getEnd(){
		return this.mEndPos;
	}
}
