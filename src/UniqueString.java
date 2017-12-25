// Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures?
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class UniqueString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check whether it contains all uniue characters");
		String s = sc.next();
		sc.close();
		boolean rslt1 = isUnique(s);
		boolean rslt2 = isUniqueCharArray(s);
		boolean rslt3 = isUniqueHashMap(s);
		
		System.out.println(rslt1);
		System.out.println(rslt2);
		System.out.println(rslt3);
		
	}
	
	// implementation using String.contains and String.substring
	public static boolean isUnique(String s) {
		int len = s.length();
		if(len == 0 || len == 1)
			return true;
		int i=0;
		while(s.substring(i+1, len).contains(s.substring(i,i+1)) == false) {
			i++;
			if(i == len-1)
				return true;
		}
		return false;
	}
	
	
	// implementation using char Array
	public static boolean isUniqueCharArray(String s) {
		char[] c = s.toCharArray();
		int[] a = new int[256];
		Arrays.fill(a, -1);
		for(int i=0; i<c.length;i++) {
			if(a[c[i]] == -1) {
			a[c[i]]++;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	// implementation using HashMap
	public static boolean isUniqueHashMap(String s) {
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		int len = s.length();
		for(int i=0;i<len;i++) {
			if(myMap.get(s.charAt(i)) == null) {
				myMap.put(s.charAt(i), 1);
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
}
