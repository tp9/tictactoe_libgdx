package com.tp9.tictactoe;

public class Tile {

	public int x, y, width, height;
	public enum State {FREE, X, O};
	public State tileState;
	
	public Tile(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.tileState = State.FREE;
	}

}
