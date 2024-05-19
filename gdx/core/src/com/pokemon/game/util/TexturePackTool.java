package com.pokemon.game.util;

import com.badlogic.gdx.tools.imagepacker.TexturePacker2;

public class TexturePackTool {
	public static void main(String[] args) {
		TexturePacker2.process(
				"mc/Walk/", 
				"mc/packed/",
				"textures");
	}
}
