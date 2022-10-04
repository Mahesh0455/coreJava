package String;

public class P4 {
	
	
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Hello");
		StringBuffer sb2=new StringBuffer("Hello");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));// 
		/*
		 * Here in stringBuffer class equals method is not overriden
		 * Hence it is calling object class equals method
		 * and object class equal method is meant for reference comparison
		 * 	
		 */
		
		
	}

}
