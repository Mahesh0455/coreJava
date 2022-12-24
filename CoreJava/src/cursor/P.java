package cursor;
import java.util.*;
public class P {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			Integer I=(Integer)itr.next();	
			if(I%2==0) {
				System.out.print(I+" ");
			}else {
				itr.remove();
			}
		}
		
		System.out.println("\n"	+list);
	}
	
	
}
