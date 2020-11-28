package baseball;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import utils.RandomUtils;

public class Baseball {	
	
	public static void start() {
		GameManager manager = new GameManager();
		Player player = new Player();
		
		String randomNumber;
		String playerNumber;
		
		randomNumber = manager.getNumber();
		
		do {
			player.input();
			playerNumber = player.getNumber();
			manager.inspect(playerNumber);
		} while(!Validator.isSame(randomNumber, playerNumber));
		
		restart(manager);
	}
	
	private static void restart(GameManager manager) {
		manager.query();
		if (manager.getQueryAnswer() == 1) {
			start();
		} else {
			System.out.println("게임을 종료합니다.");
		}
	}
}
