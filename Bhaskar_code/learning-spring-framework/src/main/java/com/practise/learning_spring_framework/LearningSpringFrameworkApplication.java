package com.practise.learning_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practise.learning_spring_framework.games.GameRunner;
import com.practise.learning_spring_framework.games.GamingConsoleInterface;
import com.practise.learning_spring_framework.games.MarioGame;
import com.practise.learning_spring_framework.games.PacManGame;
import com.practise.learning_spring_framework.games.SuperContra;
import com.practise.learning_spring_framework.games.controlller.DataController;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(LearningSpringFrameworkApplication.class, args);

		
		GamingConsoleInterface game=new PacManGame();
		//MarioGame game = new MarioGame();
		//SuperContra game=new SuperContra();
		//PacManGame game=new PacManGame();
		GameRunner runner = new GameRunner(game);
		//runner.run();

		DataController bean = run.getBean(DataController.class);
		System.out.println(bean.getcalculatedSum());
	}

}
