import java.util.Arrays;

public class Merging {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
	//	int b[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int b[]= {5, 6, 7, 8, 1, 2, 3, 4, 5};
		int m = a.length;
		int n = b.length;
		int c[] = new int[m + n];

		for (int i = 0; i < m; i++) {
		
			boolean duplicate = false;

			for (int j = 0; j < n; j++) {
				//boolean duplicate = false;
				if (a[i] == b[j]) {
				//if(a.equals(b)) {
					 duplicate = true;
					continue;
				}
					if (!duplicate) {
				//} else {
					c[m+j] = b[j];

				}
				// c[m+j] = b[j];

			}
			//System.out.println("the new array:" + Arrays.toString(c));
		}
	
	   System.out.println("the new array:" + Arrays.toString(c));
	}
}
/*
 * int m = a.length; int n = b.length;
 * 
 * int c [] = new int[m + n];
 * 
 * for(int i =0; i <m; i++) { c[i] = a[i]; } for(int i = 0; i< n; i++) { c[m+i]
 * = b[i]; } System.out.println("lenth of Array C= " + Arrays.toString(c)); } }
 */
