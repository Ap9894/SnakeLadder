package com.machinecoding;

public class Snake {
    int mSnakeId;
	int mHead, mTail;
	Snake(int id, int head, int tail){
		mSnakeId = id;
		mHead = head;
		mTail = tail;
	}
	
	int getHead(){
		return this.mHead;
	}
	
	int getTail(){
		return this.mTail;
	}
}
