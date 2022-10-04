package OOPS;

public class P7 {
	
	int i=10;
	{
		m1();
		System.out.println("First instance block");
	}
	
	P7(){
		System.out.println("Constructor");
	}
	
	
	public static void main(String[] args) {
		
		P7 p=new P7();
		System.out.println("Main Method");
		System.out.println("1st Iteration completed");
		P7 p1=new P7();
	}
	
	public void m1() {
		System.out.println(j);
	}
	
	{
		System.out.println("Second Instance Block");
	}
	int j=20;
}
