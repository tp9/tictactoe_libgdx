package com.tp9.tictactoe;

import com.badlogic.gdx.math.Rectangle;

public class Tile extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum State {FREE, X, O};
	public State tileState;
	
	public Tile(float x, float y, float width, float height) {
		super(x, y, width, height);
		this.tileState = State.FREE;
	}

	public String getTileState() {
		String tileStateChar = "";
		switch (this.tileState) {
			case X: tileStateChar = "X";
				break;
			case O: tileStateChar = "O";
				break;
			default: tileStateChar = "";
				break;
		}
		return tileStateChar;
	}
	
	public void setTileState(State s) {
		this.tileState = s;
	}
}
