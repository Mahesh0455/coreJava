package Collection_List;

import java.util.ArrayList;

public class P9 {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add("Mahesh");
		
		System.out.println(list.size());
		
		for(Object o:list) {
			System.out.print(o.toString()+" ");
		}
		
		
		
	}

}
