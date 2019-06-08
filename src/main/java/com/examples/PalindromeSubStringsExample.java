package com.examples;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PalindromeSubStringsExample {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		subPal(in.nextInt());
	}

	private static void subPal(Integer str) {
		
	     int n = str;
	     int sum = 0, r;
		 int temp = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	      {
	        System.out.println(sum  + " is a Palindrome number.");  
	      
	        String s1 = "";
			int N = str.toString().length(), count = 0;
			Set<String> palindromeArray = new HashSet<String>();
			System.out.println("Given string : " + str);
			System.out.println("******** Ignoring single character as substring palindrome");
			for (int i = 2; i <= N; i++) {
				for (int j = 0; j <= N; j++) {
					int k = i + j - 1;
					if (k >= N)
						continue;
					s1 = str.toString().substring(j, i + j);
					if (s1.equals(new StringBuilder(s1).reverse().toString())) {
						palindromeArray.add(s1);
					}
				}

			}
			System.out.println(palindromeArray);
			for (String s : palindromeArray)
				System.out.println(s + " - is a palindrome number.");
			System.out.println("The no.of substring that are palindrome : " + palindromeArray.size());
	      }
	      else    
	        System.out.println("Not a palindrome");    
	     }  
		}

