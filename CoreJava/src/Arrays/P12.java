package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class P12 {
	
	public static void main(String[] args) {
		
		String []str = {"A","Z","B","K","Y","M"};
		
		System.out.println("Before Sorting");
		
		for(String s:str) {
			System.out.print(s+" ");
		}
		
		Arrays.sort(str, new MyComparator());
		
		System.out.println("\nAfter Sorting");
		
		for(String s:str) {
			
			System.out.print(s+" ");
			
		}
		
		
		
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		
		return -s1.compareTo(s2);
	}
	
}
