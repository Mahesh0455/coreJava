package Serialization;
import java.io.*;

class S1 implements Serializable{

	private static final long serialVersionUID = 2966636050147898546L;
	int i=10;
	int j=20;
}

public class P1 {
	
	public static void main(String[] args) throws Exception {
		
		S1 s=new S1();
		
		FileOutputStream fos=new FileOutputStream("ser1.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis=new FileInputStream("ser1.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		S1 s2=(S1)ois.readObject();
		
		System.out.println("I value is :"+s2.i+ " J values is :"+s2.j);
		
	}

}
