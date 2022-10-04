package MultiThreading;

public class P3 {
	
	public static void main(String[] args) {
		
	T2 r=new T2();
	
	Thread t=new Thread(r);
	t.start();
	
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
	}
	
	
		
	}
}


class T2 implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
}
