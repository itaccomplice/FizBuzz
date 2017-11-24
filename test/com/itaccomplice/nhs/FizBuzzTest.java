package com.itaccomplice.nhs;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Test FizBuzz complies with spec.
 * @author Mark Ford
 */
public class FizBuzzTest {

	/**
	 * Basic first test with valid args should not return null.
	 */
	 @Test
	public void testConversion() {
		assertNotNull(FizBuzz.convert(1, 20));
	}
}
