package main;

import gfx.Monitor;

public class BotWars_main {

	public static void main(String[] args) {
		
		Handler h = new Handler();
		
		
		Game g = new Game(h);
		
		Monitor m = new Monitor(h);
		m.repaint();
		
		h.setM(m);
		
		g.run();
		
	}

}
