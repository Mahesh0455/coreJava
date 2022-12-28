package Collection_Map;

import java.util.*;

public class P4 {
	
	public static void main(String[] args) {
		IdentityHashMap m=new IdentityHashMap();
		
		Integer I1=new Integer(10);
		Integer I2=new Integer(10);
		System.out.println(I1==I2);
		System.out.println(I1.equals(I2));
		
		m.put(I1, "Hello");
		m.put(I2, "Hi");
		
		System.out.println(m);
	}

}
