package var_args_methods;

public class P9 {

	public static void main(String[] args) {
		int a[]= {10,20};
		int b[]= {30,40,50};
		
		m1(a,b);
		
	}
	
	public static void m1(int[]...x) {
		
		for(int[]x1:x) {
			for(int x2:x1) {
				System.out.print(x2+">>");
			}
			
		}
	}
	
}
