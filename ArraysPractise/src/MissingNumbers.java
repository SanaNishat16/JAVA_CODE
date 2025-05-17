import java.util.Arrays;
 import java.lang.Math;
public class MissingNumbers {

	public static void main(String[] args) {
		int arr[]= {-1,0,5,7,9};
		
		
	
		int min = arr[0];
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
      min = Math.min(min,arr[i]);
        max = Math.max(max,arr[i]);

		}
for(int i = min;i< max; i++) {
	boolean flag = false;
	for(int j= 0;j<arr.length;j++) {
		if (i == arr [j] ){
			flag = true;
			break;
		}
	}
	if ( flag == false) {
		System.out.println((i));
	}
}

	}

}
