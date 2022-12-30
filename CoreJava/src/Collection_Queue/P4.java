package Collection_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P4 {
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(null);
		l.add(10);
		
		System.out.println("Before Sorting:"+l);
		Collections.sort(l,new MyComparator1());
		System.out.println("After Sorting"+l);
		
	}

}

class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return -s1.compareTo(s2);
	
	}
	
}
