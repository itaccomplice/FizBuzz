package com.itaccomplice.nhs;

import org.junit.Test;

public class FizBuzzTest {

	/**
	 * Basic first test with valid args should not return null.
	 */
	 @Test
	public void testConversion() {
		assertNotNull(FizBuzz.convert(1, 20));
	}
}
