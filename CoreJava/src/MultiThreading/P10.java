package MultiThreading;


//How Thread can interrupt another Thread..

public class P10 {
	
	public static void main(String[] args) {
		System.out.println(Thread.interrupted());
		
		Thread t=Thread.currentThread();
		t.interrupt();
	}

}
	