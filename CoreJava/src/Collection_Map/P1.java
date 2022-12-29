package Collection_Map;
import java.util.*;

public class P1 {
	
	public static void main(String[] args) {
		
		
		HashMap m=new HashMap();
		m.put("Neel", 18500);
		m.put("Mahesh", 15000);
		m.put("Pawar", 12000);
		m.put("Sagar", 16000);
		m.put("Keshav", 18000);
		m.put(10, "Integer");// heterogeneous allowed
		System.out.println(m.put("Pawar", 18200));
		System.out.println(m);
		
		Set keys=m.keySet();
		System.out.println(keys);
		Collection c=m.values();
		
		System.out.println(c);
		Set es=m.entrySet();
		
		System.out.println(es);
		
		Iterator itr=es.iterator();
		
		while(itr.hasNext()) {
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println(e.getKey()+">>"+e.getValue());
			if(e.getKey().equals("Mahesh")) {
				e.setValue(20000);
			}
		}
		
		System.out.println("Final Map:"+m);
		
		
		
		
		
		
		
	}

}
