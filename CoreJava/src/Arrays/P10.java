package Arrays;
import java.util.*;

public class P10 {
	
	public static void main(String[] args) {
		
		
		int  a[]= {10,5,20,11,6};

		System.out.println("Before Sorting");
		
		for ( int i:a) {
			System.out.print(i+" ");
		}
		
		Arrays.sort(a);
		
		System.out.println("\nAfter Sorting");
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
