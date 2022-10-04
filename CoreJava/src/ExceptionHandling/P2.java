package ExceptionHandling;

import java.io.PrintWriter;

public class P2 {
	
	
	public static void main(String[] args) {
		try {
			PrintWriter pw=new PrintWriter("abc.txt");
			pw.write("Hello My name is Mahesh");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
