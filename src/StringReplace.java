import java.util.Scanner;

public class StringReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to replace space with %20");
		String s = "Mr John Smith ";
		sc.close();
		s = s.trim();
		int len_s = s.length();
		System.out.println(len_s);
		strReplace(s,len_s);
				
		
	}
	
	public static String strReplace(String s, int len_s) {
		s = s.replaceAll("\\s+", "%20");
		System.out.println(s);
		
		return "";
	}
}
