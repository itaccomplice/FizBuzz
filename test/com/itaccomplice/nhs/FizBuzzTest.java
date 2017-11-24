package com.itaccomplice.nhs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Test FizBuzz complies with spec.
 * 
 * @author Mark Ford
 */
public class FizBuzzTest {

	protected static final String STEP1_EXPECTED_RESULT = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 "
			+"fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";

	/**
	 * Basic first test with valid args should not return null.
	 */
	@Test
	public void testConversionNotNull() {
		assertNotNull(FizBuzz.convert(1, 20));
	}

	/**
	 * Test the converter with the first example from the spec.
	 */
	@Test
	public void testConversionFirstStepExample() {
		assertEquals("Incorrect result.", STEP1_EXPECTED_RESULT, FizBuzz.convert(1, 20));
	}
	
	/**
	 * Test the converter with the first example from the spec but with the args reversed.
	 */
	@Test
	public void testConvertWithArgsReversed() {
		assertEquals("Incorrect result.", STEP1_EXPECTED_RESULT, FizBuzz.convert(20,1));
	}
}
