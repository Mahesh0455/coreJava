package var_args_methods;

/*
 * We can pass normal paramter with var-arg parameter
 * but var-args paramater should be the last parameter in method
 * 
 * inside var-arg methos we can take only one var-args paramter , and
 * we cant take more than one var-arg parmater.
 * 
 * inside a class we cant declare var-arg method and corresponding one dimensional array
 * otherwise we get compile time error, because var-arg method internally gets converted into 
 * one dimensional array having same method signature
 * 
 * 
 */

public class P6 {
	
	public static void main(String[] args) {
		
	}
	
	public static void m1(String s,double...d) {
		
		System.out.println("This is: "+s);
	}
	
//	public static void m2(int...x,double...d) {
//		
//	}
	
//	public static void m3(int...x,String s) {
//		
//	}

}
