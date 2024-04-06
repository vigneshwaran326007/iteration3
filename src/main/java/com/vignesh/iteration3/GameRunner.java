package com.vignesh.iteration3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner  {
	
	@Autowired
	@Qualifier("SuperContra")
	GameConsole game;
	
	public GameRunner(GameConsole game) {
		
		this.game=game;
		
	}
	
	public void Runner() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
       
}
