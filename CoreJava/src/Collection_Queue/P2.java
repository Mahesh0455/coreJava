package Collection_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P2 {
	
	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue(15,new MyComparator());
		
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		q.offer("A");
		
		System.out.println(q);
		
		ArrayList list=new ArrayList();
		
		Collections.sort(list);
		
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s1.compareTo(s2);
		
		
		
	}
	
}
