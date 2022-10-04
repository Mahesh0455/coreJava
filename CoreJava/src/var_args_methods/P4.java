package var_args_methods;

public class P4 {
	
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30);
		m1(10,20,30,40);
	}
	
	public static void m1(int...x) {
		
		
		int sum=0;
		
		for(int x1:x) {
			sum+=x1;
		}
		System.out.println("sum is :"+sum);
	}

}
