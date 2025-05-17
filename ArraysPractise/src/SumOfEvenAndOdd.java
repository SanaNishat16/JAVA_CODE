
public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		int a[] = { 11, 222, 33, 44, 55, 66, 77, 88, 99 };

		int sumeven = 0;
		int sumodd = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sumeven = 0 + a[i];
			} else {
				sumodd = 0 + a[i];
			}
		}
		System.out.println("sum of even numbers:" + sumeven);
		System.out.println("sum of odd numbers:" + sumodd);
	}
}
