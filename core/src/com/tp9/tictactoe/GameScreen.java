package com.tp9.tictactoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector3;

public class GameScreen implements Screen {
	
	final TicTacToe game;
	
	static int TILESIZE = 96;
	static int BOARDSIZE = 3;
	static int BOARDWIDTH = Gdx.graphics.getWidth();
	static int BOARDHEIGHT = Gdx.graphics.getHeight();
	static int XMARGIN = (BOARDWIDTH - (BOARDSIZE * TILESIZE)) / 2;
	static int YMARGIN = (BOARDHEIGHT - (BOARDSIZE * TILESIZE)) / 2;
	
	ShapeType line;
	boolean active = false;
	Tile[][] squares = new Tile[3][3];

	
	public GameScreen(final TicTacToe gam) {
		game = gam;
		loadSquares();
	}

	@Override
	public void render(float delta) {
		game.shapeRenderer.begin(ShapeType.Line);
		
		for (int ypos = 1; ypos < BOARDSIZE; ypos++) {
			game.shapeRenderer.line(XMARGIN, YMARGIN + ypos * TILESIZE, BOARDWIDTH - XMARGIN, YMARGIN + ypos * TILESIZE);
		}
		for (int xpos = 1; xpos < BOARDSIZE; xpos++) {
			game.shapeRenderer.line(XMARGIN + xpos * TILESIZE, YMARGIN, XMARGIN + xpos * TILESIZE, BOARDHEIGHT - YMARGIN);
		}
		
		game.shapeRenderer.end();
		
		if (Gdx.input.isTouched()) {
			Vector3 touchPos = new Vector3();
			touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
		}
	}
	
	public void loadSquares() {
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares[i].length; j++) {
				squares[i][j] = '\u0000';
			}
		}
	}
	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

}
