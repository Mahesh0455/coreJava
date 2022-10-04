package Interface;

 interface B {
	
	int x=10;
	
	void m1();

}


public class A implements B{
	
	
	
	public void m1() {
		System.out.println("Hello");
		
		System.out.println("The value of X is :"+x);
	}
	
	
	public static void main(String[] args) {
		
		
		A a=new A();
		a.m1();
		
		
		
	}
	
}
