package file_IO;

import java.io.*;


/*File class constructor
Write a program to create Directory in Current Working directory
and create one file inside that directory*/
public class P3 {
	
	public static void main(String[] args) throws IOException {
		
		//create directory inside PWD
		
		File f=new File("Dir1");
//		if (!f.exists()) {
//			f.mkdir();
//		}else {
//			System.out.println("Dir already exists");
//		}
		System.out.println(f.mkdir());
		
		// create file in inside Dir1
		
		File f1 =new File("Dir1","ab.txt");
		if(!f1.exists()) {
			f1.createNewFile();
		}else {
			System.out.println("File already exists");
		}
		
		
	}
	
	

}
