package file_IO;
import java.io.*;

public class P9 {
	
	
	public static void main(String[] args)throws IOException {
		
		PrintWriter pw=new PrintWriter("text.txt");
		BufferedReader br=new BufferedReader(new FileReader("test.txt"));	
		String line=br.readLine();
		
		while(line != null) {
			pw.println(line);
			//pw.write(line);
			line=br.readLine();
		}
		
		
		br.close();
		pw.flush();
		pw.close();
		
		
	}

}
