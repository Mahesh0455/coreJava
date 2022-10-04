package var_args_methods;

public class P3 {
	
	// internally var-arg paramter will be converted into one dimensional array..
	/*
	 * Hence within var-args methods we can differentiate value using index..
	 */
	
	public static void m1(int...x) {
		
		System.out.println("The number of paramets passed is : "+x.length);
	}
	
	
	
	public static void main(String[] args) {
		
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30,40);
	}

}
