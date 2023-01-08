package Collection_Map;
import java.util.*;

public class P12 {
	
	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		m.put("Chiru", 700);
		m.put("Bala", 800);
		m.put("Venki", 200);
		m.put("Nag", 500);
		System.out.println(m);
		m.put("Bala", 650);
		System.out.println(m);
		Set s=m.entrySet();
		Set s2=m.keySet();
		LinkedHashSet ls=new LinkedHashSet(s2);
		Iterator its=ls.iterator();
		Iterator itr=s.iterator();
		while(its.hasNext()) {
			
			String key=(String)its.next();
			System.out.print(key);
			System.out.println(m.get(key));
		}
		
	}

}
