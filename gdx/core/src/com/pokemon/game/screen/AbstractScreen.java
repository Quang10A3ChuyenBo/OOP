package com.pokemon.game.screen;

import com.badlogic.gdx.Screen;
import com.pokemon.game.Pokemon;

public abstract class AbstractScreen implements Screen{

	private Pokemon app;
	
	public AbstractScreen(Pokemon app){
		this.app = app;
	}
	
	@Override
	public  abstract void show();

	@Override
	public abstract void render(float delta);

	@Override
	public  abstract void resize(int width, int height);

	@Override
	public  abstract void pause();

	@Override
	public  abstract void resume();

	@Override
	public  abstract void hide();

	@Override
	public abstract void dispose();

}
