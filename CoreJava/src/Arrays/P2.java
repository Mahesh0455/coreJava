package Arrays;

// Ways of creating arrays

public class P2 {
	
	public static void main(String[] args) {
		
		int a[]=new int [3];
		int b[];
		b=new int [4];
		
		System.out.println("args array lenght: "+args.length);
		System.out.println(a.getClass().getName());
		
		//int c[]=new int [-3];  // not allowed negative array size exception
		
		int d[]=new int ['a'];
		System.out.println("Length of array D is: "+d.length);
		
	}
	


}
