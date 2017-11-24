package com.itaccomplice.nhs;

import static org.junit.Assert.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

/**
 * Test the main class that uses the FizBuzz utility class to generate output to the console.
 * @author Mark Ford
 */
public class MainTest {

	/**
	 * Testing the FizBuzz output is correctly sent to the console.
	 */
	@Test
	public void testMain() {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));
        Main.main(new String[] {"1", "20"});
        String output = new String(bo.toByteArray()); 
		assertTrue("Incorrect result.", output.equals(FizBuzzTest.STEP1_EXPECTED_RESULT));
	}
	
	/**
	 * Testing an exception is thrown if the input is invalid.
	 */
	@Test(expected = NumberFormatException.class)
	public void testMainInvalidArgs() {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));
        Main.main(new String[] {"a", "b"});
	}
}
