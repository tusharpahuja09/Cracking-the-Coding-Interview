/*	
 Problem - 1.6
 String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).
*/
public class StringCompression1Point6 {
	public static void main(String args[]) {
		String s = "abc";
//		System.out.println((Integer.toString(5)));
		String s1 = compressedString(s);
		if(s1.length()>= s.length()) {
			System.out.print(s);
		} else {
			System.out.println(s1);
		}
	}
	
	
	public static String compressedString(String s) {
		
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		int j=0;
		int count = 1;
	
		Loop1:	while(j<len) {
			count = 1;
			Loop2:	while(s.charAt(j) == s.charAt(j+1)) {
				
				count++;
				j++;
				if(j == len-1) {
					sb.append(s.substring(j, j+1));
					sb.append(Character.forDigit(count, 10));
					
					break Loop1;
				}
			}
			//i++;
			sb.append(s.substring(j, j+1));
			sb.append(Character.forDigit(count, 10));
			j++;
			if(j == len - 1) {
				sb.append(s.substring(j, j+1));
				sb.append(Character.forDigit(1, 10));
				j++;
			}
			//sb.setCharAt(i++, Character.forDigit(count, 10));
		}
		return sb.toString();
		
	}
}
