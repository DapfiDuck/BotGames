package main;

import bots.BotA;
import bots.BotB;
import gfx.Monitor;

public class Handler {
	
	private BotA a;
	private BotB b;
	private Monitor m;
	
	public BotA getA() {
		return a;
	}
	public void setA(BotA a) {
		this.a = a;
	}
	public BotB getB() {
		return b;
	}
	public void setB(BotB b) {
		this.b = b;
	}
	public Monitor getM() {
		return m;
	}
	public void setM(Monitor m) {
		this.m = m;
	}
}
