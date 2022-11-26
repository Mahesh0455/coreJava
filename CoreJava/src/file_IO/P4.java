package file_IO;
import java.io.*;
public class P4 {
	
//	write a code to create a file named with abc.txt in c://xyz folder
	
	public static void main(String args[]) throws IOException {
		
		File f=new File("C:\\Users\\MPawar\\workspace\\grafana","abc.txt");
		//File f=new File("MPawar\\workspace\\grafana","abc.txt");
		
		System.out.println(f.createNewFile());
		
		System.out.println(f.length());
		System.out.println(f.list());
		
		
	}

}
