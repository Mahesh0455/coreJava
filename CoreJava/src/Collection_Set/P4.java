package Collection_Set;

import java.util.*;

public class P4 {
	
	public static void main(String[] args) {
		
		
		TreeSet t=new TreeSet();
		
		t.add("J");
		t.add("a");
		t.add("B");
		t.add("A");
		t.add("G");
		
		//t.add(null); //NPE
		
		//t.add(4); //CCE Class Cast Exception Heterogeneous not allowed because of comparison
		System.out.println(t);
	}

}
