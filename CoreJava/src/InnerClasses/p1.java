package InnerClasses;

public class p1 {
	
	int x=10;
	static int y=20;
	
	class I1{
//		int x=30;
//		int y=40;
		
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		
		p1 p=new p1();
		p1.I1 i=p.new I1();
		i.m1();
	}

}
