package DeclarationsAccessModifiers;

public class P8 {
	
	int x;
	
	final int y;
	
	{
		y=10;   // instance block will be executed before constructor...
	}
	
	
	
	
	public static void main(String[] args) {
		P8 p=new P8();
		
		System.out.println(p.x);
	}

}
