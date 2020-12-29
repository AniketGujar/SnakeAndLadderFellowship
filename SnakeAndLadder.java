package Game;
public class SnakeAndLadder {
	static int position;
	public SnakeAndLadder() {
		position = 0;
		System.out.println("Welcome to Snake and Ladder Game");
	}
	
	public static void main(String[] args) {
		SnakeAndLadder obj = new SnakeAndLadder();
		System.out.println("Player at " + position + " position");
	}

}
