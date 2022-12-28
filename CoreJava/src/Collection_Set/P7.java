package Collection_Set;

import java.util.*;

public class P7 {

	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyCompa());
		t.add("Pawar");
		t.add("Mahesh");
		t.add("Sammer");
		t.add("Kumar");
		t.add("Shiva");
		t.add("Divya");
		
		System.out.println(t);
		
	}
}


class MyCompa implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=(String)o1;
		String s2=(String)o2;
		
		return -s1.compareTo(s2);
	}
	
}
