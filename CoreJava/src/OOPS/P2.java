package OOPS;

public class P2 {

	
	 public static void main(String[] args) {
		 
		 P p=new P();
		// p.marry();
		 
		 C c=new C();
		 //c.marry();
		 
		 P p1=new C();
		 p1.marry();
		// p1.m1();
		
	}
}


class P{
	
	public void property(){
		System.out.println("Cash+Land");
	}
	
	public void marry() {
		System.out.println("A");
	}
}

class C extends P{
	
	public void marry() {
		System.out.println("B");
	}
	
	public void m1() {
		System.out.println("Child specific method");
	}
	
}
