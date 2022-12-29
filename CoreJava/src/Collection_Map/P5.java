package Collection_Map;
import java.util.*;

public class P5 {
	
	
	public static void main(String[] args) {
		
		IdentityHashMap m=new IdentityHashMap();
		
		String s1=new String ("Mahesh");
		String s2=new String("Mahesh");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		m.put(s1, "hello");
		m.put(s2, "Hi");
		
		System.out.println(m);
	}
	
	

}
