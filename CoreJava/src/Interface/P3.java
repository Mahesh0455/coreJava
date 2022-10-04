package Interface;

public class P3 implements I2,I3 {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(I2.x);
	}
	
	public void m1() {
		System.out.println("Hello");
	}
	
	
	

}


interface I2{
	
	int x=20;
	
	public void m1();
}


interface I3{
	int x=25;
	
	
	public void m1();
}
