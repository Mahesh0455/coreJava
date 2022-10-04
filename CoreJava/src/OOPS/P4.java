package OOPS;

public class P4 {

	public static void main(String[] args) {

		Object o = new String("Hello World");

		//StringBuffer sb = (StringBuffer) o;
		
		//System.out.println(sb.charAt(2));
		
		String s=new String();
		
		
		Object o1=new String("Hello");
		
		System.out.println(s.toString());
		
		A a=new A(1,"hi");
		
		System.out.println(a.toString());
	}

}


class A{
	
	int a;
	String s;
	
	public A(int a,String s) {
		
		this.a=a;
		this.s=s;
	}
	
}
