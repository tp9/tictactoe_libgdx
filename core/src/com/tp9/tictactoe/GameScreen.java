package com.tp9.tictactoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class GameScreen implements Screen {
	
	final TicTacToe game;
	
	static int TILESIZE = 96;
//	static Tile[] TILES = new Tile[9];
	static int TILE_SPACING = 96;
	static int BOARDSIZE = 3;
	static int XMARGIN = (Gdx.graphics.getWidth() - (BOARDSIZE * TILESIZE)) / 2;
	static int YMARGIN = (Gdx.graphics.getHeight() - (BOARDSIZE * TILESIZE)) / 2;
	
	ShapeType line;
	boolean active = false;
	
	public GameScreen(final TicTacToe gam) {
		game = gam;
//		loadTiles();
		drawBoard();
	}

	@Override
	public void render(float delta) {
		game.shapeRenderer.begin(ShapeType.Line);
		
		for (int ypos = 1; ypos < BOARDSIZE; ypos++) {
			game.shapeRenderer.line(XMARGIN, YMARGIN + ypos * TILESIZE, Gdx.graphics.getWidth() - XMARGIN, YMARGIN + ypos * TILESIZE);
		}
		for (int xpos = 1; xpos < BOARDSIZE; xpos++) {
			game.shapeRenderer.line(XMARGIN + xpos * TILESIZE, YMARGIN, XMARGIN + xpos * TILESIZE, Gdx.graphics.getHeight() - YMARGIN);
		}
		
		game.shapeRenderer.end();
	}
	
//	public void loadTiles() {
//		int tile = 0;
//		for (int i = 0; i < TILES.length / 3; i++) {
//			for (int j = 0; j < TILES.length / 3; j++) {
//				TILES[tile] = new Tile(i * this.TILE_SPACING, j * this.TILE_SPACING, this.WIDTH, this.HEIGHT, this);
//				tile++;
//			}
//		}
//	}
	
	public void drawBoard() {
		
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
