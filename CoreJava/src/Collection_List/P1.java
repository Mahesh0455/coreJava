package Collection_List;

import java.util.*;

public class P1 {
	
	public static void main(String[] args) {
		
		ArrayList  list=new ArrayList();
		
		list.add("A");
		list.add(10);
		list.add("B");
		list.add("C");
		list.add("A");
		list.add(null);
		
		System.out.println(list);
	
		list.remove(list.indexOf("A"));
		list.set(2, "D");
		System.out.println(list);
		
		
	}

}
