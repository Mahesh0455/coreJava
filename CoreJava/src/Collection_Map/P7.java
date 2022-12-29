package Collection_Map;

import java.util.*;

public class P7 {
	
	public static void main(String[] args) {
		
		TreeMap t=new TreeMap(new MyComparator());
		t.put("SSS", 1000);
		t.put("FFFF", 1001);
		t.put("ZZZZ", 102);
		t.put("AAAA", "hELLO");
		t.put("XXXX", new StringBuffer("Heterogeous object"));
		t.put("YYYY", "hI");
		
		System.out.println(t);
		
	}

}


class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		
		return -s1.compareTo(s2);
		
		
	}
	
}
