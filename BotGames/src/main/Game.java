package main;

import javax.swing.JOptionPane;

import bots.Bot;
import bots.BotA;
import bots.BotB;

public class Game {

	BotA a;
	BotB b;

	Handler h;

	public Game(Handler h) {

		this.h = h;

		a = new BotA((byte) 0, (byte) 0);
		b = new BotB((byte) 9, (byte) 9);

		a.setRotation((byte) 2);
		b.setRotation((byte) 4);

		a.setSize((byte) 10, (byte) 10);
		b.setSize((byte) 10, (byte) 10);

		h.setA(a);
		h.setB(b);

	}

	byte movea, moveb;

	public void run() {

		loop();

		Bot winner = null;

		if (a.getHp() <= 0) {
			winner = b;
		} else if (b.getHp() <= 0) {
			winner = a;
		}

		JOptionPane.showMessageDialog(null, winner.getName() + " winns.");

	}

	void loop() {

		while (a.getHp() > 0 && b.getHp() > 0) {

			// System.out.println("looping");

			tick();
			h.getM().repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	void tick() {

		// System.out.println("ticking");

		movea = a.getMove(a.getVisual());
		moveb = b.getMove(b.getVisual());

		if (movea == 7) {
			a.setShield(true);
		} else if (movea == 1) {
			a.addY((byte) -1);
		} else if (movea == 2) {
			a.addY((byte) 1);
		} else if (movea == 3) {
			a.addX((byte) -1);
		} else if (movea == 4) {
			a.addX((byte) 1);
		} else if (movea == 5) {
			blow(a, b);
		} else if (movea == 6) {
			laser(a, b);
		} else if (movea != 0) {
			a.addHP((byte) -50);
		}

		b.setShield(false);

		if (moveb == 7) {
			b.setShield(true);
		} else if (moveb == 1) {
			b.addY((byte) -1);
		} else if (moveb == 2) {
			b.addY((byte) 1);
		} else if (moveb == 3) {
			b.addX((byte) -1);
		} else if (moveb == 4) {
			b.addX((byte) 1);
		} else if (moveb == 5) {
			blow(b, a);
		} else if (moveb == 6) {
			laser(b, a);
		} else if (moveb != 0) {
			b.addHP((byte) -50);
		}

		a.setShield(false);

	}

	void blow(Bot b, Bot t) {

		double d = Math.pow(sqr((double) b.getX() - (double) t.getX()) + sqr((double) b.getY() - (double) t.getY()),
				1. / 2);

		if (d < 2) {
			t.addHP((byte) -10);
		}

		b.addHP((byte) -5);

	}

	void laser(Bot b, Bot t) {

		b.setLasering(true);

		if ((b.getRotation() == 1 && t.getY() < b.getY() && t.getX() == b.getX())
				|| (b.getRotation() == 2 && t.getX() > b.getX() && t.getY() == b.getY())
				|| (b.getRotation() == 3 && t.getY() > b.getY() && t.getX() == b.getX())
				|| (b.getRotation() == 4 && t.getX() < b.getX() && t.getY() == b.getY())) {
			t.addHP((byte) -5);
		} else {
			b.addHP((byte) -1);
		}

	}

	double sqr(double d) {
		return d * d;
	}

}
