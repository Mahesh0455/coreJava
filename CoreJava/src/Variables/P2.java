package Variables;

public class P2 {
	
	int x=10;
	public static void main(String[] args) {
		
		P2 p =new P2();
		
		System.out.println(p.x);
		p.m1();
		
	}
	
	public void m1() {
		
		System.out.println("Instance variable can accessed in Instance method directly: "+x);
	}
}


// we cant access instance variable directly from static area...but we can access them using object 
// but we can access instance variable in instance area..