package com.itaccomplice.nhs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The FizBuzz class is a utility class that will convert a range of numbers into the specified
 * FizBuzz output.
 * @author Mark Ford
 */
public final class FizBuzz {

	/**
	 * Private constructor this is a utility class.
	 */
	private FizBuzz() {
		// Empty private constructor to prevent instantiation.
	}

	/**
	 * Convert the range of numbers into the specified FizBuzz output.
	 * @param start Start number.
	 * @param end End number.
	 * @return The specified FizBuzz string output.
	 */
	public static String convert(int start, int end) {
		int from = start;
		int to  = end;
		if (start > end) {
			from = end;
			to = start;
		}
		return IntStream.rangeClosed(from, to).mapToObj(FizBuzz::mapToFizBuzz).
				collect(Collectors.joining(" "));
	}

	/**
	 * Maps a number to a string as required. i.e. Multiple of 3 - 'fizz'
	 * Multiple of 5 - buzz.
	 * @param val the number to map.
	 * @return A string representation of the number or corresponding string if mapped.
	 */
	private static String mapToFizBuzz(int val) {
		
		StringBuilder sb = new StringBuilder();
		if (val % 3 == 0) {
			sb.append("fizz");
		}
		if (val % 5 == 0) {
			sb.append("buzz");
		}
		if (sb.length() == 0) {
			sb.append(val);
		}
		return sb.toString();
	}
	
}
