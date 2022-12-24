package cursor;

import java.util.*;

public class P2 {
	
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		Enumeration e=v.elements();
		
		Iterator itr=v.iterator();
		
		ListIterator li=v.listIterator();
		
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(li.getClass().getName());
	}

}
