import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings to check whether they are each other's permutation");
		String s1 = sc.next();
		System.out.println("Enter 2nd String");
		String s2 = sc.next();
		sc.close();
		boolean rslt1 = areStringPermutation(s1,s2);
		System.out.println(rslt1);
	}
	
	
	public static boolean areStringPermutation(String s1, String s2) {
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		}
}