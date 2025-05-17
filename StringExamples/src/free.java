
 

import java.util.Scanner;

public class free {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.nextLine();
		nonRepeatingChar(str);
		scanner.close();

	}

	private static void nonRepeatingChar(String str) {
		// TODO Auto-generated method stub
		char[] ch = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++)
		{
			int count = 0;
			for (int j = i; j < ch.length; j++)
			{
				if(ch[i] == ch[j]) {
					count++;
					i = j;
				}
			}
			if(count == 1) {
				System.out.println("The first non-repeating char : " + ch[i]);
				break;
			}
		}
		
	}

}


