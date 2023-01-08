package Collection_List;
import java.util.*;

public class P10 {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		for(int i=10;i<20;i++) {
			v.add(i);
		}
		
		System.out.println(v);
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		
		System.out.println("\nIntial Default Capacity:="+v.capacity());
		v.add(20);
		System.out.println("Incremental Capacity:="+v.capacity());
		
		
		
		
	}

}
