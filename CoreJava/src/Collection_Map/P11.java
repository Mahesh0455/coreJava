package Collection_Map;

import java.io.*;
import java.util.*;

public class P11 {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		FileInputStream fis = new FileInputStream("props.properties");

		p.load(fis);

		System.out.println(p);

		FileOutputStream fos = new FileOutputStream("props.properties");
		p.setProperty("Git-URL", "https://github.com/Mahesh0455");

		p.store(fos, "Git-URL");

		System.out.println(p);

	}

}
