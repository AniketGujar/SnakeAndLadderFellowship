package Game;

import java.util.Random;

public class SnakeAndLadder {
	
	static int position;
	static int diceRoll;
	static int optionDice;
	public SnakeAndLadder() {
		position = 0;
		System.out.println("Welcome to Snake and Ladder Game");
	}
	public void diceRoll() {
		Random rand = new Random();
		diceRoll = rand.nextInt(6)+1;
		System.out.println("Dice Rolled: "+ diceRoll);
	}
	public void option() {
		Random rand = new Random();
		optionDice = rand.nextInt(3);
		
		switch(optionDice) {
		case 0:
				System.out.println("Option-No Play");
		break;
		case 1:
				System.out.println("Option-Ladder");
				position = position + diceRoll;
		break;
		case 2:
				System.out.println("Option-Snake");
				position = position - diceRoll;
				if (position < 0) {
					position = 0;
				}
		}
	}
	public static void main(String[] args) {
		SnakeAndLadder obj = new SnakeAndLadder();
		System.out.println("Player at " + position + " position");
		obj.diceRoll();
		obj.option();
		System.out.println("Player at " + position + " position");
	}
}
