package com.gcs.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gcs.app.GaliCricketScoreboard;

/**
 * GCS: Gali Cricket Scoreboard
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to GCS");
		System.out.println("Please provide number of balls to bowled");

		Scanner sc = new Scanner(System.in);
		int numberOfBalls = sc.nextInt();
		List<Character> actionsPerEachBall = new ArrayList<Character>(numberOfBalls);

		int ballNumber = 0;
		while (ballNumber < numberOfBalls) {
			ballNumber++;
			System.out.println("Please provide the action for ball number: " + ballNumber);
			String line = sc.next();
			char action = line.charAt(0);
			actionsPerEachBall.add(action);
		}
		sc.close();

		System.out.println("\nEvaluating Score\n");
		GaliCricketScoreboard gcs = new GaliCricketScoreboard();
		int finalScore = gcs.calculateScore(actionsPerEachBall);
		System.out.println("Team score at the end: " + finalScore);
	}
}
