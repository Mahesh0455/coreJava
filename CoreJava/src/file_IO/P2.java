package file_IO;

import java.io.*;

public class P2 {
	
	
	public static void main(String arge[]) {
		
		
		File f=new File("Dir1");
		System.out.println(f.exists());
		
		f.mkdir();
		
		System.out.println(f.exists());
	}

}
