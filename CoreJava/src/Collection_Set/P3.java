package Collection_Set;

import java.util.*;

public class P3 {
	
	public static void main(String[] args) {
		
		
		SortedSet lhs=new TreeSet();
		
		lhs.add("k");
		lhs.add("B");
		//lhs.add(null);
		lhs.add("N");
		lhs.add("A");
		lhs.add("C");
		System.out.println(lhs.add("B"));
		System.out.println(lhs);
		
		System.out.println(lhs.comparator());

		
		
		}

}
