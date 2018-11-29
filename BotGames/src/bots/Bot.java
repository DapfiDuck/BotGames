package bots;

import java.awt.Color;

public abstract class Bot {

	byte idle = 0, up = 1, down = 2, left = 3, right = 4, blow = 5, laser = 6, shield = 7;

	/*
	 * Options: 0 idle 1 up 2 down 3 left 4 right 5 blow 6 laser 7 shield
	 */

	private byte hp = 100, x, y, rotation, sx, sy;
	private boolean shielded, lasering;
	private String name;
	Color c;

	public Bot(byte x, byte y, String name) {

		this.setX(x);
		this.setY(y);
		this.setName(name);

	}

	public void setSize(byte sx, byte sy) {
		this.sx = sx;
		this.sy = sy;
	}

	public byte getHp() {
		return hp;
	}

	public void setHp(byte hp) {
		this.hp = hp;
	}

	public void addHP(byte hp) {

		if (!isShielded())
			this.hp += hp;
	}

	public byte getX() {
		return x;
	}

	public void setX(byte x) {
		this.x = x;
	}

	public void addX(byte x) {
		if (x + this.x >= 0 && x + this.x < sx)
			this.x += x;

		if (x > 0) {
			rotation = 2;
		} else if (x < 0) {
			rotation = 4;
		}
	}

	public byte getY() {
		return y;
	}

	public void setY(byte y) {
		this.y = y;
	}

	public void addY(byte y) {
		if (y + this.y >= 0 && y + this.y < sy)
			this.y += y;

		if (y > 0) {
			rotation = 3;
		} else if (y < 0) {
			rotation = 1;
		}
	}

	public boolean isShielded() {
		return shielded;
	}

	public void setShield(boolean shielded) {
		this.shielded = shielded;
	}

	public byte getRotation() {
		return rotation;
	}

	public void setRotation(byte rotation) {
		this.rotation = rotation;
	}

	public boolean isLasering() {
		return lasering;
	}

	public void setLasering(boolean lasering) {
		this.lasering = lasering;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
