package com.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static com.examples.StringExample.addtwostrings;
import static com.examples.StringExample.getLength;
import static com.examples.StringExample.getStringSplit;

public class StringExamplesTest {

	@Test
	public void TestConcateStrings() {
		String S1 = new String("TestString");
		String S2 = new String("vasavi");
		String S3 = addtwostrings(S1, S2);
		assertEquals("TestStringvasavi", S3);
	}

	@Test
	public void TestStringLength() {
		String S1 = new String("TestString");
		String S2 = new String("vasavi");
		int[] expected = { 10, 6 };
		int[] actual = getLength(S1, S2);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void TestSplitString() {
		String S1 = new String("TestString");
		String S2 = new String("vasavi");
		String[] actual = getStringSplit(S1, S2);
		String[] expected = { "T", "e", "s", "t", "S", "t", "r", "i", "n", "g", "v", "a", "s", "a", "v", "i" };
		assertArrayEquals(expected, actual);
	}
}
