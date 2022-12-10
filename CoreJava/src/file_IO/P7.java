package file_IO;
import java.io.*;

public class P7 {
	
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("abc.txt");
		
		int i=fr.read();
		
		while (i > 0) {
			System.out.print((char)i);
			fr.read();
		}
		
		fr.close();
	}

}
