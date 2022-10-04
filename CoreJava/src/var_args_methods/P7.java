package var_args_methods;

/*
 * when there is fight between normal and var-arg method
 * always normal method wins, to provide compatibility to older versions
 * 
 * var-args methods have least priority than normal methods
 * if no other method not matched then var-arg method will be called
 */

public class P7 {
		
	public static void main(String[] args) {
		
		
		m1();
		m1(10,20);
		m1(10);  // 
	}
	
	
	public static void m1(int...x) {
		System.out.println("Var-arg- method");
	}
	
	public static void m1(int x) {
		System.out.println("General method");
	}

}
