package ExceptionHandling;

public class P8 {
	
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			throw new ArithmeticException();
			//System.out.println("Exception handled");
		}
		
		System.out.println("Hello");
	}

}
