package com.examples;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		

		String c = addtwostrings(a, b);
		System.out.println("Concatinating Two Strings: " + c);

		int[] d = getLength(a, b);
		System.out.println("Get String Length: " + Arrays.toString(d));

		String[] e = getStringSplit(a, b);
		System.out.println("Get String Split:" + Arrays.toString(e));
	}

	public static String addtwostrings(String a, String b) {
		return (a + b);
	}

	public static int[] getLength(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		int[] total = { aLength, bLength };

		return total;
	}

	public static String[] getStringSplit(String a, String b) {
		String[] aArray = a.split("");
		String[] bArray = b.split("");

		int length = a.length() + b.length();
		String[] result = new String[length];

		System.arraycopy(aArray, 0, result, 0, a.length());
		System.arraycopy(bArray, 0, result, a.length(), b.length());

		return result;
	}
}
