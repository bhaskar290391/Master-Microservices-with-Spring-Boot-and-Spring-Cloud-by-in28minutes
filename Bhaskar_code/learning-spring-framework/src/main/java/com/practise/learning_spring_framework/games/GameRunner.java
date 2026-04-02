package com.practise.learning_spring_framework.games;

public class GameRunner {

	// private MarioGame game;

	// private SuperContra game;

	private GamingConsoleInterface game;

	public GameRunner(GamingConsoleInterface game) {
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
