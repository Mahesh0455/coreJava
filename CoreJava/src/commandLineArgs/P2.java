package commandLineArgs;


/*
 * The main advantage of command line  args is to we can customize
 * behavior of main method
 */
public class P2 {
	
	public static void main(String[] args) {
		
		
		int a=Integer.parseInt(args[0]);
		
		System.out.println("The Square of no: "+a +" ="+a*a);
	}

}
