package file_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P1 {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("ab.xlsx");
		f.createNewFile();
		
		System.out.println(f.exists());
		
		FileWriter fw =new FileWriter("abc.txt");
		fw.append('M');
	}

}
