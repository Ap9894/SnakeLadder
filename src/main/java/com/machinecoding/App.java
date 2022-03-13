package com.machinecoding;

/**
 * Hello world!
 *
 */

 // Online Java Compiler
// Use this online editor to compile and run Java code online
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Enter snake cnt");
		int snakeCnt = scanner.nextInt();
		

		ArrayList<Integer> snakeHead = new ArrayList<>();
		ArrayList<Integer> snakeTail = new ArrayList<>();
		
		for(int i=0;i<snakeCnt;i++){
            System.out.println("Enter snake head");
			int head = scanner.nextInt();
			snakeHead.add(head);
            System.out.println("Enter snake tail");
			int tail = scanner.nextInt();
			snakeTail.add(tail);
		}
		
        System.out.println("Enter ladder cnt");
		int ladderCnt = scanner.nextInt();
		
		ArrayList<Integer> ladderStart = new ArrayList<>();
		ArrayList<Integer> ladderEnd = new ArrayList<>();
		
		for(int i=0;i<ladderCnt;i++){
            System.out.println("Enter ladder start");
			int start = scanner.nextInt();
			ladderStart.add(start);
            System.out.println("Enter ladder end");
			int end = scanner.nextInt();
			ladderEnd.add(end);
		}
		
        System.out.println("Enter player cnt");
		int playerCnt = scanner.nextInt();
		
		ArrayList<String> playerNames = new ArrayList<>();
		
		for(int i=0;i<playerCnt;i++){
            System.out.println("Enter player name");
			String name = scanner.next();
			playerNames.add(name);
		}
		scanner.close();

		GameSystem gameSystem = new GameSystem();
		gameSystem.initialiseGame(snakeHead, snakeTail, ladderStart, ladderEnd, playerNames);
		gameSystem.startGamePlay();
    }
}
