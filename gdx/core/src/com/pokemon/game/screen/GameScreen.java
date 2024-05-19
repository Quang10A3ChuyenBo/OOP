package com.pokemon.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.pokemon.game.Pokemon;
import com.pokemon.game.Setting;
import com.pokemon.game.controller.PlayerController;
import com.pokemon.game.model.Actor;
import com.pokemon.game.model.Camera;
import com.pokemon.game.model.TERRAIN;
import com.pokemon.game.model.Tile;
import com.pokemon.game.model.TileMap;
import com.pokemon.game.util.AnimationSet;

public class GameScreen extends AbstractScreen {

   private PlayerController controller;

   private Actor player;

   private TileMap map;

   private SpriteBatch batch;

   private Texture samuredstand;
   private Texture grassor_1;
   private Texture grassor_2;
   private Texture grassor_3;
   
   private Camera camera;

   public GameScreen(Pokemon app) {
       super(app);
       samuredstand = new Texture("C:\\Users\\HP\\gdx\\core\\mc\\pic1.png");
       grassor_1 = new Texture("C:\\Users\\HP\\gdx\\core\\asserts\\map\\map1\\grassoranget.png");
       grassor_2 = new Texture("C:\\Users\\HP\\gdx\\core\\asserts\\map\\map1\\grassoranget2.png");
       grassor_3 = new Texture("C:\\Users\\HP\\gdx\\core\\asserts\\map\\map1\\grassoranget3.png");
       batch = new SpriteBatch();

       TextureAtlas atlas = app.getAssetManager().get("C:\\Users\\HP\\gdx\\core\\mc\\packed\\textures.atlas",TextureAtlas.class);
       
       AnimationSet animations  = new AnimationSet(
    		   new Animation(0.6f/3f, atlas.findRegion("smnorth"), PlayMode.LOOP_PINGPONG),
    		   new Animation(0.6f/3f, atlas.findRegion("smstaight"), PlayMode.LOOP_PINGPONG),
    		   new Animation(0.6f/3f, atlas.findRegion("smeast"), PlayMode.LOOP_PINGPONG),
    		   new Animation(0.6f/3f, atlas.findRegion("smwest"), PlayMode.LOOP_PINGPONG),
    		   atlas.findRegion("smstandnorth"),
    		   atlas.findRegion("smstandsouth"),
    		   atlas.findRegion("smstandeast"),
    		   atlas.findRegion("smstandwest")
    		   );
       
       map = new TileMap(20, 20);

       player = new Actor(map, 0, 0,animations);

       controller = new PlayerController(player);
       
       this.camera = new Camera();
   }

   @Override
   public void show() {
       Gdx.input.setInputProcessor(controller);
   }

   @Override
   public void render(float delta) {
	   
	   controller.update(delta);
	   
	   player.update(delta);
	   camera.update(player.getWorldX() + 0.5f, player.getWorldY() + 0.5f);
	   
       batch.begin();
       
       	float worldStartX = Gdx.graphics.getWidth()/2 - camera.getCamX()*Setting.SCALED_TILE_SIZE;
       	float worldStartY = Gdx.graphics.getHeight()/2 - camera.getCamY()*Setting.SCALED_TILE_SIZE;
           for (int x = 0; x < map.getWidth(); x++) {
        	   for (int y = 0; y < map.getHeight(); y++) {
        		   Texture render = null;
        		   if (map.getTile(x, y).getTerrain() == TERRAIN.grassor_1) {
        			   render = grassor_1;
        		   }
        		   if (map.getTile(x, y).getTerrain() == TERRAIN.grassor_2) {
        			   render = grassor_2;
        		   }
        		   if (map.getTile(x, y).getTerrain() == TERRAIN.grassor_3) {
        			   render = grassor_3;
        		   }
        	   batch.draw(render,
        			   worldStartX+x*Setting.SCALED_TILE_SIZE,
        			   worldStartY+y*Setting.SCALED_TILE_SIZE,
        			   Setting.SCALED_TILE_SIZE,
        			   Setting.SCALED_TILE_SIZE);
           }
       }
       batch.draw(player.getSprite(),
    		   worldStartX + player.getWorldX() * Setting.SCALED_TILE_SIZE,
    		   worldStartY + player.getWorldY() * Setting.SCALED_TILE_SIZE,
               Setting.SCALED_TILE_SIZE,
               Setting.SCALED_TILE_SIZE * 1.5f);
       batch.end();
   }

   @Override
   public void resize(int width, int height) {
       // Add code as needed for resizing the game screen
   }

   @Override
   public void pause() {
       // Add code as needed for pausing the game
   }

   @Override
   public void resume() {
       // Add code as needed for resuming the game from a paused state
   }

   @Override
   public void hide() {
       // Add code as needed when the game screen is hidden
   }

   @Override
   public void dispose() {
       // Add code as needed for disposing of resources used by the game screen
   }
}
