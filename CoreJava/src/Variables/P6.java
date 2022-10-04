package Variables;

public class P6 {
	
	static int x=10;
	int y=20;
	
	public static void main(String[] args) {
		P6 p1=new P6();
		p1.x=100;
		p1.y=200;
		
		P6 p2 =new P6();
		
		System.out.println(p2.x);
		System.out.println(p2.y);
	}

}
