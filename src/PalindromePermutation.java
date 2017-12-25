/*
Palindrome Permutation: Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat'; "atc o eta·; etc.)
*/

import java.util.Arrays;

public class PalindromePermutation {
	public static void main(String args[]) {
	String s = "tactcooapapam";
	boolean rslt = isPalindromePermutation(s);
	System.out.println(rslt);
	}


public static boolean isPalindromePermutation(String s) {
	s = s.trim();
	s = s.replaceAll("\\s+", "");
	s = s.toLowerCase();
	System.out.println(s);
	char[] sChar = s.toCharArray();
	int[] count = new int[256];
	int countOdd =0;
	
	int len = sChar.length;
	boolean odd = false;
	Arrays.fill(count, 0);
	for(int i=0;i<len;i++) {
		count[sChar[i]]++;
	}
	
	if((len&1) != 0)
		odd = true;
	for(int i=0;i<len;i++) {
		if((count[sChar[i]]&1) != 0) {
			countOdd++;
			if((!odd && countOdd>0) ||(odd && countOdd > 1))
				return false;
			
		}
	}
	
	
	return true;
}
}