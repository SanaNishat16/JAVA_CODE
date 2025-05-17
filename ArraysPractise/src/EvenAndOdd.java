import java.util.Scanner;
import java.util.Arrays;
public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the index number:");

		int s = scan.nextInt();
		int b[] = new int[s];

		System.out.println("enter the element input :");
	
         for(int i = 0; i <s; i++) {
        	 b[i] = scan.nextInt();
        	 
        		 }
					
		int odd = 0 ;
	int even = 0;

		for (int i = 0; i < s; i++) {
			if (b[i] % 2 == 0) {
			even = b[i];
			
			} else {
			odd = b[i];
			}
		}
		System.out.println("Even elements: " + even);
		System.out.println("Odd elements: " + odd);
	}
	

}
