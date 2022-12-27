package Collection_Set;
import java.util.*;

public class P1 {
	
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		
		hs.add("A");
		hs.add("B");
		hs.add(null);
		hs.add(3);
		hs.add(6);
		System.out.println(hs.add("B"));
		System.out.println(hs);
		
		
		
	}

}
