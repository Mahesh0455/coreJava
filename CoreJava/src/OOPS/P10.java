package OOPS;

public class P10 {
	
	public static void main(String[] args) {
		
		C1 c=new C1();
		//c.methodOne();
		c.methodOne(10);
		I1 i=new I1();
		//i.methodOne(20);
		
		I1 ii=new C1();
		//ii.methodOne(30);
		
		
	}
	
	

}


class I1{
	
	public  final void methodOne() {
		System.out.println("I1 Method");
	}
	
}


class C1 extends I1{
	
	public void methodOne(int i) {
		
		System.out.println("Child Method");
	}
	
	

	
	
	
}
