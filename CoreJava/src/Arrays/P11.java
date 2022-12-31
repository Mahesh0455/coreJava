package Arrays;

import java.util.Arrays;

public class P11 {
	
	public static void main(String[] args) {
		
		String []s= {"A","Z","B"};
		System.out.println("Before Sorting");
		for(String str:s) {
			System.out.print(str+" ");
		}
		
		Arrays.sort(s);
		System.out.println("\nAfter Sorting");
		for(String str:s) {
			System.out.print(str+" ");
		}
	}

}
