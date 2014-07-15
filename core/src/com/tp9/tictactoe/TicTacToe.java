package com.tp9.tictactoe;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;


public class TicTacToe extends Game {
	ShapeRenderer shapeRenderer;
	GameScreen setScreen;
	SpriteBatch batch;
	
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		batch = new SpriteBatch();
		Gdx.graphics.setContinuousRendering(false);
		Gdx.graphics.requestRendering();
		this.setScreen(new GameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose() {
		shapeRenderer.dispose();
	}
}
