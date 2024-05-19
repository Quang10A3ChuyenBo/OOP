package com.pokemon.game.model;

public class Tile {
	 	
		private TERRAIN terrain;
		
		private Actor actor;

		public Tile(TERRAIN terrain) {
			this.terrain = terrain;
		}

		public TERRAIN getTerrain()
		{
			return terrain;
		}
		@SuppressWarnings("unused")
		private int id,x,y,type;
	    
		
	    public Actor getActor() {
			return actor;
		}

		public void setActor(Actor actor) {
			this.actor = actor;
		}

}
