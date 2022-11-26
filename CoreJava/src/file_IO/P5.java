package file_IO;

import java.io.*;

public class P5 {
	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\MPawar\\workspace","");
		
		
		String [] files=f.list();
		
		for(String file:files) {
			
		
			
			System.out.println(file);
			
		}
	}

}
