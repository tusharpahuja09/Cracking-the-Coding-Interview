/* Problem - 1.8
Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ZeroMatrix1Point8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		ArrayList<Integer> zeroRows = new ArrayList<Integer>();
		ArrayList<Integer> zeroColumns = new ArrayList<Integer>();
		System.out.println("Enter no. of Rows of Matrix");
		m = sc.nextInt();
		System.out.println("Enter no. of Columns of Matrix");
		n=sc.nextInt();
		int[][] a = new int[m][n];
		int count =0;
		System.out.println("Enter Elements of Matrix");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
	Loop1:	for(int i=0;i<m;i++) {
	Loop2:		for(int j=0;j<n;j++) {
				if(a[i][j] == 0) {
					if(zeroRows.contains(i))
						break Loop2;
					if(zeroColumns.contains(j))
						continue;
					zeroRows.add(i);
					zeroColumns.add(j);
					setRowZero(a,i);
					setColumnZero(a,j);
						
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
	
	public static void setRowZero(int[][] a,int i) {
		for(int j=0;j<a.length;j++) {
			a[i][j] = 0;
		}
		
	}
	public static void setColumnZero(int[][] a,int j) {
		for(int i=0;i<a.length;i++) {
			a[i][j] = 0;
		}
	}
	
	
}
