/*
Problem 1.5:-
One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bae -> false
 
 */
public class OneAway1Point5 {
	public static void main(String[] args) {
		String s1 ="bae";
		String s2 = "pale";
		boolean rslt = false;
		if(s1.length() == s2.length()) {
			rslt = isOneReplaceAway(s1,s2);
		}
		
		if(s1.length() +1 == s2.length()) {
			rslt = isOneEditAway(s1,s2);
		}
		
		if(s1.length() == s2.length() +1) {
			rslt = isOneEditAway(s2,s1);
		}
		
		System.out.println(rslt);
		
	}
	
	
	public static boolean isOneReplaceAway(String s1, String s2) {
		boolean diff = false;
		
		if(s1.equals(s2))
			return true;
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				if(diff)
					return false;
				diff = true;
			}
		}
		
		return true;
		
	}
	
	public static boolean isOneEditAway(String s1, String s2) {
		boolean diff = false;
		int index1=0;
		int index2=0;
		
		while(index1<s1.length() && index2<s2.length()) {
		
			if(s1.charAt(index1)!= s2.charAt(index2)) {
				if(diff)
					return false;
				diff = true;
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		
		return true;
		
	}
	
}
