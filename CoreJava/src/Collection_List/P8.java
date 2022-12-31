package Collection_List;
import java.util.*;

public class P8 {
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(5);
		l.add(18);
		
		System.out.println("Before Sorting"+l);
		
		Collections.sort(l,new MyComparator());
		
		System.out.println("After Sorting"+l);
		
		System.out.println(Collections.binarySearch(l, 6,new MyComparator()));
		
	}
	
	
	


}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		
		return -I1.compareTo(I2) ;
	}
	
}
