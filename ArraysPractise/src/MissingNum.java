import java.util.Arrays;

public class MissingNum {

	public static void main(String[] args) {
int arr[] = {-5, -3,-8,4,2,6};

Arrays.sort(arr);
System.out.println("sorted Arrays"+ Arrays.toString(arr));  

int min = arr[0];
int max = arr[arr.length - 1];


for(int i = min;  i < max; i++) {
	boolean flag = false;
	for(int j = 0; j<arr.length;j++) {
	if(i == arr[j]) {
		flag = true;
	break;
	
}
	}
if(flag == false) {
	System.out.print(i+" ");
}
}
}}