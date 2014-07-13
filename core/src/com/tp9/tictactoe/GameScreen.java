package com.tp9.tictactoe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.tp9.tictactoe.Tile.State;


public class GameScreen implements Screen {
	
	final TicTacToe game;
	
	static int TILESIZE = 125;
	static int BOARDSIZE = 3;
	static int BOARDWIDTH = Gdx.graphics.getWidth();
	static int BOARDHEIGHT = Gdx.graphics.getHeight();
	static int XMARGIN = (BOARDWIDTH - (BOARDSIZE * TILESIZE)) / 2;
	static int YMARGIN = (BOARDHEIGHT - (BOARDSIZE * TILESIZE)) / 2;
	
	ShapeType line;
	boolean active = false;
	Tile[][] squares = new Tile[3][3];
	BitmapFont font;

	
	public GameScreen(final TicTacToe gam) {
		game = gam;
		loadSquares();
		font = new BitmapFont();
		font.setColor(Color.WHITE);
		font.setScale(5);
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
		
		game.batch.begin();
		
		Vector2 centerCoord = new Vector2();
		float leftPos, topPos = 0;
		for (int y = 0; y < squares.length; y++) {
			for (int x = 0; x < squares[y].length; x++) {
				squares[y][x].getCenter(centerCoord);
				leftPos = (centerCoord.x + squares[y][x].getX()) / 2;
				topPos = Gdx.graphics.getHeight() - ((centerCoord.y + squares[y][x].getY()) / 2);
				
				font.draw(game.batch, squares[y][x].getTileState(), leftPos, topPos);
			}
		}
		
		game.batch.end();
		
		if (Gdx.input.isTouched()) {
			Vector2 touchPos = new Vector2();
			touchPos.set(Gdx.input.getX(), Gdx.input.getY());
			for (int y = 0; y < squares.length; y++) {
				for (int x = 0; x < squares[y].length; x++) {
					if (squares[y][x].contains(touchPos)) {
						squares[y][x].setTileState(State.X);
					}
				}
			}
			
		}
		
	}
	
	public void loadSquares() {
		float xcoord, ycoord;
		for (int y = squares.length - 1; y >= 0; y--) {
			for (int x = 0; x < squares[y].length; x++) {
				xcoord = XMARGIN + (x * TILESIZE);
				ycoord = YMARGIN + (y * TILESIZE);
				
				squares[y][x] = new Tile(xcoord, ycoord, TILESIZE, TILESIZE);
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
