package com.practise.learning_spring_framework.games;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsoleInterface {

	public void up() {
		System.out.println("PacManGame==> Up");
	}

	public void down() {
		System.out.println("PacManGame==> down");
	}

	public void left() {
		System.out.println("PacManGame==> left");
	}

	public void right() {
		System.out.println("PacManGame==> right");
	}
}
