package var_args_methods;


/*
 * 
 * in some of cases if we need to pass one parameter compulsory and then any number
 *  of parameters
 * then we can pass normal parameter along with var-args paramter.
 */

public class P5 {

	
	public static void main(String[] args) {
		
		//m1();  invalid because need at least on argument
		
		m1(1);
		m1(10,20);
		m1(10,20,30,40);
		
	}
	
	public static void m1(int x,int...y) {
		
		int total=x;
		
		for(int a:y) {
			total=total+a;
		}
		
		System.out.println("The sum is: "+total);
		
	}

}
