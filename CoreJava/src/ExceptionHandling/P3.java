package ExceptionHandling;

public class P3 {
	
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("Statement 3");
		}catch(Exception e) {
			System.out.println(10/0);
		}
		
	}

}
