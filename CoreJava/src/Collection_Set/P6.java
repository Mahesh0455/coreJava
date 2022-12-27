package Collection_Set;

import java.util.*;

public class P6 {
	
	public static void main(String[] args) {
		
TreeSet t=new TreeSet(new MyClass());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(5);
		t.add(20);
		t.add(14);
		
		System.out.println("Hello"+	t);
		
	}

}

class MyClass implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i=(Integer)o1;
		Integer j=(Integer)o2;
		
		return -i.compareTo(j);
	}
	
}
