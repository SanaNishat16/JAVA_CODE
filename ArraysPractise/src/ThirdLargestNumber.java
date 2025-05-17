
public class ThirdLargestNumber {

	public static void main(String[] args) {

		int first, second, third;
		first = second = third = 0;
		int a[] = { 101, 97, 111, 88, 150, 100, 126 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] > first) {
				third = second;
				second = first;
				first = a[i];

			} else if (a[i] != first && a[i] > second) {
				third = second;
				second = a[i];
			} else if (a[i] != second && a[i] > third) {
				third = a[i];

			}
		}

		System.out.println("third largest number :" + third);
	}
}








public class EvenNumber{
	public static void main(String[]args) {
		int arr [] = m1();
		int even = 0;
		 for(int i = 0; i <arr.length;i++) {
			 if(arr[i]% 2==0) {
				 even = arr[i];
				 System.out.println("expexted output "+even);
			 }
		 }
	
			 public staic int[]m1(){
				 return new int [] {4,7,10,3,8};
			 }
			 
		 
	}
}












