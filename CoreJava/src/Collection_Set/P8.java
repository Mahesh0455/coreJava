package Collection_Set;

import java.util.*;

public class P8 {
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new StringBufferComparator());
		t.add(new StringBuffer("Pawar"));
		t.add(new StringBuffer("Mahesh"));
		t.add(new StringBuffer("Sameer"));
		t.add(new StringBuffer("Kumar"));
		t.add(new StringBuffer("Shiva"));
		t.add(new StringBuffer("Divya"));
		System.out.println(t);
		
	}

}

class StringBufferComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
		//return -s1.compareTo(s2); // for reverse order
	}
	
	
	
}
