package Collection_List;

import java.util.*;

public class P4 {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		System.out.println("Intial Capacity: "+v.capacity());
		
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		
		System.out.println(v);
		
		v.add("Mahesh");
		System.out.println(v);
		System.out.println(v.capacity());
		
		
	}

}
