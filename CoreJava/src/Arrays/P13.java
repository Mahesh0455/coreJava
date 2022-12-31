package Arrays;

import java.util.Arrays;

public class P13 {
	
	public static void main(String[] args) {
		int []arr= {10,5,20,11,6};
		
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		System.out.println("\n"+Arrays.binarySearch(arr, 10));
		System.out.println(Arrays.binarySearch(arr, 12));
		
	}

}
