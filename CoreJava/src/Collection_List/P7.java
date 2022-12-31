package Collection_List;

import java.util.*;

public class P7 {
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		//l.add(5);
		System.out.println("Before sorting"+l);
		
		Collections.sort(l);
		
		System.out.println("After Sorting"+l);
		
		System.out.println(Collections.binarySearch(l, "M"));
		
		System.out.println(Collections.binarySearch(l, "J"));
		
		
		
	}

}
