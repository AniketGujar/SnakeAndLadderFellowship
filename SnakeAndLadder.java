package Game;

import java.util.Random;

public class SnakeAndLadder {
	
	static int position;
	static int diceRoll;
	public SnakeAndLadder() {
		position = 0;
		System.out.println("Welcome to Snake and Ladder Game");
	}
	public void diceRoll() {
		Random rand = new Random();
		diceRoll = rand.nextInt(6)+1;
		System.out.println("Dice Rolled :" + diceRoll);
	}
	public static void main(String[] args) {
		SnakeAndLadder obj = new SnakeAndLadder();
		System.out.println("Player at " + position + " position");
		obj.diceRoll();
	}
}
