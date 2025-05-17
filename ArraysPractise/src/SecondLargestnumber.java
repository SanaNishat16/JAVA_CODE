  import java.util.Arrays;
public class SecondLargestnumber {

	public static void main(String[] args) {
   int a []= {22,111,-102,76,97,89,-121,100};
	int large = 0;
	int secondlarge = 0;
	
	
	for(int i =0; i< a.length;i++) {
	if(a[i] > large) {
		secondlarge=large;
		large=a[i];
	
	}else if (a[i] != large && a[i] > secondlarge){
		secondlarge = a[i];
	}
	}
	System.out.println("large number: " + large);
	System.out.println("secondlarge number: " + secondlarge);
		
	}
}
	

	
	
	

