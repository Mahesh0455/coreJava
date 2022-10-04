package var_args_methods;

public class P2 {
	
	public static void m1(int... x){
		
		System.out.println("Var-arg methods");
		
	}
	
	public static void main(String[] args) {
		
		
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30,40);
		
		
	}

}
