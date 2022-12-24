package ArrayList;

import java.util.*;

public class P5 {
	
	public static void main(String[] args) {
		
		Vector v=new Vector(10,5);
		
		System.out.println("Intial Capacity of Vector: "+v.capacity());
		
		for (int i=1;i<=10;i++) {
			
			v.add(i);
			
		}
		
		System.out.println(v);
		
		v.addElement("Pawar");
		
		System.out.println(v);
		System.out.println("Next capactity:"+v.capacity());
	}

}
