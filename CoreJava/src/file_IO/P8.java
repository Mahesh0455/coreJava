package file_IO;
import java.io.*;



public class P8 {
	
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("test.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello World");
		bw.newLine();
		bw.write("Good Evening");
		bw.flush();
		bw.close();
		
		FileReader fr=new FileReader("test.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while (s !=null) {
			System.out.println(s);
			s=br.readLine();
		}
		
		br.close();
		
	}

}
