package com.itaccomplice.nhs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The FizBuzz class is a utility class that will convert a range of numbers
 * into the specified FizBuzz output.
 * 
 * @author Mark Ford
 */
public final class FizBuzz {

	/** Constant for 'buzz'. */
	private static final String BUZZ = "buzz";
	
	/** Constant for 'fizz'. */
	private static final String FIZZ = "fizz";
	
	/** Constant for 'luck'. */
	private static final String LUCKY = "lucky";

	/**
	 * Private constructor this is a utility class.
	 */
	private FizBuzz() {
		// Empty private constructor to prevent instantiation.
	}

	/**
	 * Convert the range of numbers into the specified FizBuzz output.
	 * 
	 * @param start
	 *            Start number.
	 * @param end
	 *            End number.
	 * @return The specified FizBuzz string output.
	 */
	public static String convert(int start, int end) {
		int from = start;
		int to = end;
		if (start > end) {
			from = end;
			to = start;
		}
		return IntStream.rangeClosed(from, to)
				.mapToObj(String::valueOf)
				.map(FizBuzz::mapToLuck)
				.map(FizBuzz::mapToFizzBuzz)
				.collect(Collectors.joining(" "));
	}

	/**
	 * If the arg contains a '3' return 'luck', other wise return the original arg.
	 * @param val the string to map.
	 * @return "luck" if the arg contains a 3, or the arg unchanged.
	 */
	private static String mapToLuck(String val) {
		String result = val;
		if (val.contains("3")) {
			result = LUCKY;
		}
		return result;
	}

	/**
	 * If the arg is 'lucky' - return 'lucky'
	 * If the arg is a number and a multiple of 3 - return 'fizz'
	 * if the arg is a number and a multiple of 5 - return 'buzz'
	 * else return the original arg.
	 * @param val the number to map.
	 * @return A string representation of the number or corresponding string if mapped.
	 */
	private static String mapToFizzBuzz(String val) {
		StringBuilder sb = new StringBuilder();
		if (val.equals(LUCKY)) {
			sb.append(LUCKY);
		} else {
			if (Integer.valueOf(val) % 3 == 0) {
				sb.append(FIZZ);
			}
			if (Integer.valueOf(val) % 5 == 0) {
				sb.append(BUZZ);
			}
		}
		if (sb.length() == 0) {
			sb.append(val);
		}
		return sb.toString();
	}

}
