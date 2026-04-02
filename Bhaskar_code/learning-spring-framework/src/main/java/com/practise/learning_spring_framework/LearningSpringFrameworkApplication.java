package com.practise.learning_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practise.learning_spring_framework.games.GameRunner;
import com.practise.learning_spring_framework.games.GamingConsoleInterface;
import com.practise.learning_spring_framework.games.MarioGame;
import com.practise.learning_spring_framework.games.PacManGame;
import com.practise.learning_spring_framework.games.SuperContra;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringFrameworkApplication.class, args);

		
		GamingConsoleInterface game=new PacManGame();
		//MarioGame game = new MarioGame();
		//SuperContra game=new SuperContra();
		//PacManGame game=new PacManGame();
		GameRunner runner = new GameRunner(game);
		runner.run();

	}

}
