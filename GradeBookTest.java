/**
 * 
 */

import junit.framework.TestCase;

/**
 * 
 */
public class GradeBookTest extends TestCase {

	GradeBook g1, g2;
	
	protected void setUp() throws Exception {
		super.setUp();
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(4.1);
		g1.addScore(6.5);
		g1.addScore(10.0);
		
		g2.addScore(3.5);
		g2.addScore(3.7);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		g1 = null;
		g2 = null;
	}

	/**
	 * Test method for {@link GradeBook#addScore(double)}.
	 */
	public void testAddScore() {
		assertTrue(g1.toString().equals("4.1 6.5 10.0 "));
		assertTrue(g2.toString().equals("3.5 3.7 "));
		assertEquals(g1.getScoreSize(), 3);
		assertEquals(g2.getScoreSize(), 2);
	}

	/**
	 * Test method for {@link GradeBook#sum()}.
	 */
	public void testSum() {
		assertEquals(g1.sum(), 20.6);
		assertEquals(g2.sum(), 7.2);
	}

	/**
	 * Test method for {@link GradeBook#minimum()}.
	 */
	public void testMinimum() {
		assertEquals(g1.minimum(), 4.1);
		assertEquals(g2.minimum(), 3.5);
	}

	/**
	 * Test method for {@link GradeBook#finalScore()}.
	 */
	public void testFinalScore() {
		assertEquals(g1.finalScore(), 16.5);
		assertEquals(g2.finalScore(), 3.7);
	}

}
