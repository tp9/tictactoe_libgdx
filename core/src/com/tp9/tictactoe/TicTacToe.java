package com.tp9.tictactoe;

import com.badlogic.gdx.Game;


public class TicTacToe extends Game {
	
	@Override
	public void create () {
		this.setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
