import static org.junit.Assert.*;

import org.junit.Test;


public class ScoreBoardTestDetail {
	MatchScoreBoardDetail score1=new MatchScoreBoardDetail();
	@Test
	public void testScoreBoard() {
//		fail("Not yet implemented");
	}

	@Test
	public void testAddBalls() {
		score1.addBalls(6);
		score1.addBalls(6);
		score1.addBalls(6);
		score1.addBalls(4);
		score1.addBalls(0);
		score1.addBalls(1);
		assertEquals(1, score1.getCurrentBall()); //runs Scored of The previous ball
		assertEquals(23, score1.getCurrentScore());
	}

	@Test
	public void testGetCurrentScore() {
//		fail("Not yet implemented");
	}

	@Test
	public void testPrintScoreCard() {
//		fail("Not yet implemented");
	}

	@Test
	public void testGetScorePer() {
//		fail("Not yet implemented");
	}

}
