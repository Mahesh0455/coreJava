package ArrayList;

import java.util.*;
public class P3 {
	
	
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("A");
		ll.add(5);
		ll.add(null);
		ll.add("Mahesh");
		String s=(String)ll.getLast();
		System.out.println(s);
		
	}

}
