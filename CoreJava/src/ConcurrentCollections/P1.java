package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

//Need of concurrent collection
/*1.MOst of the collections are not thread safe.
2.Those which are Thread Safe are not up to the mark performance wise.
3.while iterating if we try to modify the collection object w'll get exception
*/
public class P1 extends Thread{
	
	private static ArrayList l=new ArrayList();
	
	
	
	
	@Override
	public void run() {
		
		try {
			l.add("D");
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
			System.out.println("Child Thread updating list");
		}
	
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		l.add("A");
		l.add("B");
		l.add("C");
		
		P1 p=new P1();
		p.start();
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			
			String s=(String)itr.next();
			System.out.println(s);
			Thread.sleep(3000);
		}
		
		
		
	}

}
