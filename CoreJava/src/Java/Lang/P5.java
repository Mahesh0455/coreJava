package Java.Lang;

import java.lang.reflect.Method;

public class P5 {
	
	public static void main(String[] args) {
		
		Object o=new String("Mahesh");
		
		Class c=o.getClass();
		int methodCount=0;
		
		System.out.println("Fully Qualified Name: "+c.getName());
		Method m[]=c.getDeclaredMethods();
		for (Method m1:m) {
			methodCount ++;
			
			System.out.println(m1.getName());
			
		}
		System.out.println("NUmber of methods in class: "+c.getName()+" is: "+methodCount);
		
	}

}
