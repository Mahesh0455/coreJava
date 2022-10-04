package OOPS;

public class P3 {
	public static void main(String[] args) {
		
		Par1 p=new Child1();
		
		p.m1();// over riding concept is not appilcable for static methods. so parent method will be called.
		p.m2();
	}

}


class Par1{
	
	public static void m1() {
		System.out.println("parent static method");
	}
	
	public void m2() {
		System.out.println("parent instance method");
	}
	
	public void m3() {
		System.out.println("Parent m3 method");
	}
	
}


class Child1 extends Par1{
	
	
	public static void m1() {
		System.out.println("Child overiding method");
	}
	
	public void m2() {
		System.out.println("Child instance method");
	}
	
/*
 * public static void m3() { System.out.println(); } }
 * 
 */
	
}