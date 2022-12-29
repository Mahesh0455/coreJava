package Collection_Map;
import java.util.*;
import java.io.*;

public class P10 {
	
	public static void main(String[] args) throws IOException {
		
		
		Properties p=new Properties();
		FileInputStream fis=null;
		
		FileOutputStream fos=null;
		
		try {
			 fis=new FileInputStream("abc.properties.txt");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		p.load(fis);
		
		fos=new FileOutputStream("props.properties");
		
		p.store(fos, "Storing Properties");
		
		
		System.out.println(p);
		
		
		
	}
	
	

}
