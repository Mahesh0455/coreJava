package Collection_Set;

import java.util.*;

public class P11 {
	
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator2()) ;
		//TreeSet t=new TreeSet() ;
		
		t.add(new StringBuffer("Mahesh"));
		t.add(new StringBuffer("Pawar"));
		t.add(new StringBuffer("Karan"));
		t.add(new StringBuffer("Suraj"));
		t.add(new StringBuffer("Raj"));
		t.add(new StringBuffer("Shyam"));
		t.add(new StringBuffer("Alok"));
		
		System.out.println(t);
			
		
		
	}

}

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		
		if(s1.length()==s2.length()) {
			return s1.compareTo(s2);
		}
		
		return s1.compareTo(s2);
		
		
		
		
		
	}
	
}
