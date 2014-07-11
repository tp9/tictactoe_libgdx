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

}
