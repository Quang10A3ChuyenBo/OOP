package com.pokemon.game.model;


import java.util.Objects;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;  


public class TileMap {
   
   private int width, height;
   private Tile[][] tiles;
   private Texture mapTexture;
   
	public TileMap(int width, int height) {
       this.width = width;
       this.height = height;
       
       Math.random() ;
       
       tiles = new Tile[width][height];
           
           for (int y = 0; y < height; y++) {
               for (int x = 0; x < width; x++) {
            	   if (Math.random() <= 0.3d) {
            		   tiles[x][y] = new Tile(TERRAIN.grassor_1);
            		   
            	   } else {
            		   if (Math.random() > 0.3d && Math.random() < 0.65d) {
                		   tiles[x][y] = new Tile(TERRAIN.grassor_2);
                		   
                	   } else {
                		   tiles[x][y] = new Tile(TERRAIN.grassor_3);
                		   
                	   }
            	   }
               }
           }
           
       } 
       	
              
                  
   
   public Texture getMapTexture() {
       return mapTexture;
   }
   
   public Tile getTile(int x, int y) {
       return tiles[x][y];
   }
   
   public int getWidth() {
   	return width;
   }
   
   public int getHeight() {
   	return height;
   }
}
