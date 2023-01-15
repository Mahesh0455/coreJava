package Development;

import java.util.Properties;

public class P2 {
	
	public static void main(String[] args) {
		
		
		Properties p=System.getProperties();
		
		String name=System.getProperty("development");
		
		if(name.equals("Mahesh")) {
			System.out.println("Mahesh Pawar");
		}else {
			System.out.println("Other Developer");
		}
		
		//p.list(System.out);
	}

}
