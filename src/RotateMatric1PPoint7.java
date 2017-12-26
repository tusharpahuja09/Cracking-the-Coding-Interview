/*	Problem 1.7
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place? 
 */
public class RotateMatric1PPoint7 {
	public static void main(String[] args) {
		int[][] a = new int[4][4];
		int count =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j] = count++;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
		
		rotateMatrix(a);
		
	}
	
	
	public static boolean rotateMatrix(int[][] a) {
		
		int temp,right,bottom,left;
		int n = a.length;
		if(n == 0 || n != a[0].length)
			return false;
		for(int layer=0;layer<n/2;layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i=first;i<last;i++) {
				int offset = i-first;
				
				int top = a[first][i];
				a[first][i] = a[last-offset][first];
				a[last-offset][first] = a[last][last-offset];
				a[last][last-offset] = a[i][last];
				a[i][last] = top;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
			
			}
			System.out.println();
	}

		
		return true;
	}

}
