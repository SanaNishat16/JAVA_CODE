import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("index number:");
		int num = scan.nextInt();

		int a[] = new int[num];

		System.out.println("enter the elements");
		for (int i = 0; i < num; i++) {
			a[i] = scan.nextInt();

		}
		System.out.println("print the elements:");
		for (int i = 0; i < num; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();

		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += a[i];
		}
		System.out.println("sum of all elements:" + sum);

	}

}
