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

	static final String STEP3_EXPECTED_RESULT = "1 2 luck 4 buzz fizz 7 8 fizz "
			+ "buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz"
			+ "\nfizz: 4\nbuzz: 3\nfizzbuzz: 1\nluck: 2\nnumber: 10";
	
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
		assertEquals("Incorrect result.", STEP3_EXPECTED_RESULT, FizBuzz.convert(1, 20));
	}
	
	/**
	 * Test the converter with the first example from the spec but with the args reversed.
	 */
	@Test
	public void testConvertWithArgsReversed() {
		assertEquals("Incorrect result.", STEP3_EXPECTED_RESULT, FizBuzz.convert(20,1));
	}
}
