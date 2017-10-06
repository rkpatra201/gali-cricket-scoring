package com.gcs.app;

import java.util.List;

public class GaliCricketScoreboard {

	public int calculateScore(List<Character> actions) {
		int finalScore = 0;
		int ballNum = 0;
		int runsScoredOnPrevball = -1; // runs scored by batsman on previous
										// ball
		for (Character action : actions) {
			ballNum++;
			if (Character.isDigit(action)) {
				// get the runs scored by ball and add with finalScore
				int runScoredOnThisBall = Character.digit(action, 10);
				finalScore = finalScore + runScoredOnThisBall;
				System.out.println(runScoredOnThisBall + " runs was scored on the ball number: " + ballNum
						+ " , Team Score: " + finalScore);

				/*
				 * if 0 runs scored for 2 consecutive balls then consider
				 * batsmen is out and deduct 2 runs from final score
				 */
				if ((runScoredOnThisBall == 0) && (runsScoredOnPrevball == 0)) {
					finalScore = finalScore - 2;
					System.out.println("As previous ball was also" + runsScoredOnPrevball
							+ ", batsmen is out. Deduct 2 runs from team score. Team score: " + finalScore);
					// needs to be reset when batsMen is out after facing 2
					// consecutive dot balls
					runsScoredOnPrevball = -1;
					continue;
				}

				runsScoredOnPrevball = runScoredOnThisBall;

			} else if (action == 'W' || action == 'w') {
				/*
				 * batsmen is out when the input character is W or w, hence
				 * deduct 2 runs from the finalScore
				 */
				finalScore = finalScore - 2;
				System.out.println("Wicket fell in the ball number:" + ballNum
						+ ", Deduct 2 runs from team score. Team score: " + finalScore);
				runsScoredOnPrevball = -1;
			}
		}

		return finalScore;
	}

}
