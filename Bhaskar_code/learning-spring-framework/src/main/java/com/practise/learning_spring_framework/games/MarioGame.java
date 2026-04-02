package com.practise.learning_spring_framework.games;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsoleInterface{

	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Go to the hole");
	}

	public void left() {
		System.out.println("stop");
	}

	public void right() {
		System.out.println("Accelerate");
	}
}
