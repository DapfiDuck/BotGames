package gfx;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import bots.BotA;
import bots.BotB;
import main.Handler;

public class Monitor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	BotA a;
	BotB b;

	public Monitor(Handler h) {
		super("Wargames");

		this.a = h.getA();
		this.b = h.getB();

		this.setSize(819, 845);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
		this.setResizable(false);

		this.setVisible(true);

	}

	public void paint(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(0, 0, 820, 845);

		g.setColor(Color.BLACK);
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				g.drawRect(i * 80 + 9, j * 80 + 35, 80, 80);

			}

		}
		

//		int xp, yp;

		
		g.setColor(new Color(100, 0, 0));
//		g.fillRect(a.getX()*80+9+35, a.getY()*80+35+35, lx, ly);
		g.fillRect(a.getX() * 80 + 9, a.getY() * 80 + 35, 80, 80);
		g.drawString(String.valueOf(a.getHp()), a.getX()*80+9, a.getY()*80+35);

//		xp 	= a.getX() * 80 + 44;
//		yp 	= a.getY() * 80 + 75;
//		byte r = a.getRotation();

//		if (r == 1) {
//			yp -= 20;
//		} else if (r == 2) {
//			xp += 20;
//		} else if (r == 3) {
//			yp += 20;
//		} else if (r==4) {
//			xp-=20;
//		}
//		
//		g.setColor(Color.white);
//		g.fillRect(xp-10, yp-10, 20, 20);

		g.setColor(new Color(0, 0, 100));
		g.fillRect(b.getX() * 80 + 9, b.getY() * 80 + 35, 80, 80);
		g.drawString(String.valueOf(b.getHp()), b.getX()*80+9, b.getY()*80+35);
		
//		xp 	= b.getX() * 80 + 44;
//		yp 	= b.getY() * 80 + 75;
//		r 	= b.getRotation();
		
//		if (r == 1) {
//			yp -= 20;
//		} else if (r == 2) {
//			xp += 20;
//		} else if (r == 3) {
//			yp += 20;
//		} else if (r==4) {
//			xp-=20;
//		}
		
//		g.setColor(Color.white);
//		g.fillRect(xp-10, yp-10, 20, 20);

	}

}
