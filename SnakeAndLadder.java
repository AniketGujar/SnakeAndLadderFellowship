package Game;

import java.util.Random;

public class SnakeAndLadder {
	
	static int position;
	static int diceRoll;
	static int diceRoll1;
	static int diceRoll2;
	static int optionDice;
	static int diceRollCount;
	static int playerOnePos;
	static int playerTwoPos;
	
	public SnakeAndLadder() {
		position = 0;
		System.out.println("Welcome to Snake and Ladder Game");
	}
	public int diceRoll() {
		Random rand = new Random();
		diceRoll = rand.nextInt(6)+1;
		diceRollCount++;
		System.out.println("No. of Times Dice Rolled "+ diceRollCount +" : " + diceRoll);
		return diceRoll;
	} 
	public void option() {
		Random rand = new Random();
		optionDice = rand.nextInt(3);
		position = 0;
		
		switch(optionDice){
		case 0:
			System.out.println("Option-No Play");
			diceRoll=0;
		break;
		case 1:
			System.out.println("Option-Ladder");
			position = position + diceRoll;
						
		break;
		case 2:
			System.out.println("Option-Snake");
			position = position - diceRoll;
			
		}
	}
	public void player1() {
		diceRoll1=diceRoll();
		option();
		diceRoll1=diceRoll;
		if (position <0) {
			playerOnePos = playerOnePos - diceRoll1;
			if (playerOnePos <0) {
				playerOnePos=0;
			}
		}
		else {
			playerOnePos = playerOnePos + diceRoll1;
		}
		System.out.println("Player1 at :"+ playerOnePos + " position");
		if (playerOnePos >100) {
			playerOnePos = playerOnePos - diceRoll1;
			System.out.println("Player1 at :"+ playerOnePos + " position");
		}
	}
	public void player2() {
		diceRoll2=diceRoll();
		option();
		diceRoll2=diceRoll;
		if (position <0) {
			playerTwoPos = playerTwoPos - diceRoll2;
			if (playerTwoPos <0) {
				playerTwoPos=0;
			}
		}
		else {
			playerTwoPos = playerTwoPos + diceRoll2;
		}
		System.out.println("Player2 at :"+ playerTwoPos + " position");
		if (playerTwoPos >100) {
			playerTwoPos = playerTwoPos - diceRoll2;
			System.out.println("Player2 at :"+ playerTwoPos + " position");
		}
	}
	public static void main(String[] args) {
		SnakeAndLadder obj = new SnakeAndLadder();
		while(playerOnePos <100 && playerTwoPos <100) {
			obj.player1();
			obj.player2();
			System.out.println("===================================");
		}
		if (playerTwoPos==100){
			System.out.println("******Player Two Wins******");
		}
		else {
			System.out.println("******Player One Wins******"); 
		}
	}
}
