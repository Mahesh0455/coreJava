package ExceptionHandling;

public class P1 {
	
	
	public static void main(String[] args) {
		
		
		doStuff();
	}
	
	public static void doStuff() {
		try {
			doMoreStuff();
		}catch(Exception E) {
			E.printStackTrace();
		}
		
		System.out.println("doStuff continues normally");
		
	}
	
	
	public static void doMoreStuff() {
		
		System.out.println(10/0);
		
			
		
		System.out.println("doMoreStuff continues normally");
	}

}
