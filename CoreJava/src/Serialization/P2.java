package Serialization;

import java.io.*;

public class P2 implements Serializable {
	
	String username="Mpawar";
	transient String passwd="PawarM";
	
	
	public static void main(String[] args) throws Exception {
		
		P2 p=new P2();
		
		//serialization
		
		FileOutputStream fos=new FileOutputStream("a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(p);
		
		// Deserialization
		
		FileInputStream fis=new FileInputStream("a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		P2 p1=(P2)ois.readObject();
		
		System.out.println("User Name: "+ p1.username +"\tPassword: "+p1.passwd);
		
		
		
		
		
		
		
		
		
	}

}
