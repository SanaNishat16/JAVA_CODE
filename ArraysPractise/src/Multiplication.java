import java.util.Arrays;
public class Multiplication         {
 public static void main (String[]args) {
	 
	 int a[][]= { {1,2,3},{4,5,6}};
	 int b[][]= {{3,2,1},{6,5,4},{2,4,6}};
	 
	 int m = a.length;
	 int n = b.length;
	 int r = a[0].length;
	 int s = b[0].length;
	 
	 int c[][] = new int[m][s];
	 
	 if(r==n) {
		 for(int i = 0; i < m; i++) {
			 for(int j = 0; j < r; j++) {
				 for(int k = 0; k < s; k++ ) {
					 c[i][k] += a[i][j] * b[j][k];
				 }
			 }
		 }
	 }else {
		 System.out.println("Multiplication cannot be possible ");
	 }
	 //print of arrays:
	 for(int i =0; i<c.length; i++) {
		 for(int j =0; j< c[i].length; j++ ) {
			 System.out.print(c[i][j] +"\t");
		 }
		 System.out.println();
	 }
 }
}