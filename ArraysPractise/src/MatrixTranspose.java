import java.util.Arrays;
public class MatrixTranspose {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 4, 3, 2,1} };

		int m = a.length;
		int n = a[0].length;

		int b[][] = new int[n][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[j][i] = a[i][j];
			}
		}
			// for printing :
		/*
	System.out.println("the matric of a");
		for(int i  = 0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j] +"\t");
			}
			System.out.println();
		
		}
		*/
			System.out.println(" the matrix transpose of an array:");
			for(int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(b[i][j] + "\t");

				}
				System.out.println();
			}
		
	}
	}


