package Collection_Set;

import java.util.*;

public class P5 {
	
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(5);
		t.add(20);
		t.add(14);
		
		System.out.println(t);
		
		
	}

}


class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i=(Integer)o1;
		Integer j=(Integer)o2;
		
		if(i>j) {
			return -1;
		}else if(i<j) {
			return 1;
		}else {
			return 0;
		}
	
		
	}
	
}
