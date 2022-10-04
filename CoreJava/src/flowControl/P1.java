package flowControl;

public class P1 {
	
	public static void main(String[] args) {
		
		byte b=10;
		
		switch(b+2) {
		
		case 10:
			System.out.println("10");
			System.out.println("Hello");
			
		case 11:
			System.out.println("20");
			System.out.println("Hello 20");
			break;
		case 100:
			System.out.println("100");
		
		default :
			System.out.println("No case matched");
		
		
		}
		
	}

}
