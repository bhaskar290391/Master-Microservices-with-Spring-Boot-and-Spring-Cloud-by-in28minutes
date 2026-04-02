package com.practise.learning_spring_framework.games;

public class GameRunner {

	//private MarioGame game;

	private SuperContra game;
	
	public GameRunner(SuperContra game) {
		super();
		this.game = game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
