package Collection_Map;
import java.util.*;

public class P6 {
	
	public static void main(String[] args) {
		
		
		TreeMap t=new TreeMap();
		
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
		
		//t.put(null, 1000);// null comparison
		//t.put("ABC", "jjj"); non homogeneous keys
		
		System.out.println(t);
	}

}
