package Collection_Map;

import java.util.*;

public class P9 {
	
	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
		h.put(10, "A");
		h.put(20, "B");
		System.out.println(h.put(10, "C"));
		h.put(30, "D");
		h.put(50, "A");
		h.put(40, "C");
		
		System.out.println(h);

	}

}


