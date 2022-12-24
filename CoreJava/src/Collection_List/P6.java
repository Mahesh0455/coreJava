package Collection_List;

import java.util.*;

public class P6 {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("Mahesh");
		
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.empty());
		s.pop();
		
		System.out.println(s);
		
		System.out.println(s.search("Mahesh"));
		
		
	}
}
