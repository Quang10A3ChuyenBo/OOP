package com.pokemon.game.model;

public class Camera {
	private float camX = 0f;
	private float camY = 0f;
	
	public void update(float newcamX, float newcamY) {
		this.camX = newcamX;
		this.camY = newcamY;
		
	}

	public float getCamX() {
		return camX;
	}


	public float getCamY() {
		return camY;
	}
	
	
}
