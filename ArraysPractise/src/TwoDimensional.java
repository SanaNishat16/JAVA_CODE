import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row and colos");
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		int  a [][] = new int[row][col];
		
		for(int i = 0; i< row; i++) {
			for(int j = 0; j< col; j++) {
				System.out.println("enter the element:" + i +" and " + j );
				a [i][j] = scan.nextInt();
			}
			
		}
		
		// for accessing:
		for(int i = 0; i <a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
