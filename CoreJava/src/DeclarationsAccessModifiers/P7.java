package DeclarationsAccessModifiers;

public class P7 {
	
	
	public static void main(String[] args) {
		
		Z z=new Z();
		
		z.m1();
		
		
	}

}


abstract class A{
	
	
	abstract public void m1();
	
	private void m2() {
		System.out.println("Hello I'm Private method");
	}
}

class Z extends A{

	public void m1() {
		System.out.println("M1 Method Overridden");
	}
	
	
	
}
