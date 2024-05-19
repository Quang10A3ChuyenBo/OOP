package com.pokemon.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		
		config.setWindowedMode(1280,720);
		config.useVsync(true);
		config.setTitle("GamePoke");
		
		new Lwjgl3Application(new Pokemon(),config);
		
	}
}
