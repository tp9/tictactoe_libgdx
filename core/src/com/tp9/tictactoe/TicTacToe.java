package com.tp9.tictactoe;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class TicTacToe extends Game {
	ShapeRenderer shapeRenderer;
	GameScreen setScreen;
	
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		this.setScreen(new GameScreen(this));
//		setScreen.setActive(true);
	}

	@Override
	public void render () {
		super.render();
	}
}
