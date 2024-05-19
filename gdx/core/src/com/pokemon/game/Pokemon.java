package com.pokemon.game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.pokemon.game.screen.GameScreen;

@SuppressWarnings("unused")
public class Pokemon extends Game {
	
	private GameScreen screen ;
	
	private AssetManager AMG;
	
	@Override
	public void create () {
		AMG = new AssetManager();
		AMG.load("C:\\Users\\HP\\gdx\\core\\mc\\packed\\textures.atlas",TextureAtlas.class);
		AMG.finishLoading();
		
		screen = new GameScreen(this);
		 
		 this.setScreen(screen);
	}
	@Override
	public void render() {
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	
	public AssetManager getAssetManager() {
		return AMG; 
	}
}
