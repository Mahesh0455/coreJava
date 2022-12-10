package file_IO;
import java.io.*;

public class P6 {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw=new FileWriter("abc.txt");
		fw.write('M');
		fw.write("ahesh Pawar");
		fw.write("\nGood morning");
		fw.flush();
		fw.close();
	}
	

}
