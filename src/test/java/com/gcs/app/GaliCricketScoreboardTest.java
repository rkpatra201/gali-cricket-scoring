package com.gcs.app;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class GaliCricketScoreboardTest {

	@Test
	public void testCalculateScore() {
		GaliCricketScoreboard gcs = new GaliCricketScoreboard();

		Character[] input1 = { '1', '0', '0', '6', 'W' };
		int finalScore1 = 3;
		Assert.assertEquals(finalScore1, gcs.calculateScore(Arrays.asList(input1)));

		Character[] input2 = { '1', '0', '0', '0', 'W' };
		int finalScore2 = -3;
		Assert.assertEquals(finalScore2, gcs.calculateScore(Arrays.asList(input2)));

		Character[] input3 = { '0', '0', '0' };
		int finalScore3 = -2;
		Assert.assertEquals(finalScore3, gcs.calculateScore(Arrays.asList(input3)));

		Character[] input4 = { 'W', 'W', 'W', 'W' };
		int finalScore4 = -8;
		Assert.assertEquals(finalScore4, gcs.calculateScore(Arrays.asList(input4)));

		// test case from the doc
		Character[] input5 = { '1', '1', '0', 'W', '1' };
		int finalScore5 = 1;
		Assert.assertEquals(finalScore5, gcs.calculateScore(Arrays.asList(input5)));

		// test case from the doc
		Character[] input6 = { '1', '0', '0', 'W' };
		int finalScore6 = -3;
		Assert.assertEquals(finalScore6, gcs.calculateScore(Arrays.asList(input6)));

	}

}
