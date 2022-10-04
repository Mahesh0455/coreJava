package ExceptionHandling;

public class P4 {
	
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
	}

}
