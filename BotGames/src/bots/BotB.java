package bots;

public class BotB extends Bot {
	
	public BotB(byte x, byte y) {
		super(x, y, "B");
	}

	public byte getMove(byte[][] visual) {
		return idle;
	}
	
	/*
	 * Options:
	 * 0 idle
	 * 1 up
	 * 2 down
	 * 3 left
	 * 4 right
	 * 5 blow
	 * 6 laser
	 * 7 shield
	 */
	
}
