package main_method;

public class P3 {
	
	public static void main(String[] args) {
		
		System.out.println("Parent main");
	}

}

class C1 extends P3{
	
	public static void main(String[] args) {
		System.out.println("Child Main");
	}
	
}
