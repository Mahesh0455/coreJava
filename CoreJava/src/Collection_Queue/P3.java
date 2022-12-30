package Collection_Queue;

import java.util.ArrayList;
import java.util.Collections;

public class P3 {
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(null);
		l.add(10);
		System.out.println("Before Sorting: "+l);
		
		Collections.sort(l);
		System.out.println("After Sorting:"+l);
		
		
		
	}

}
