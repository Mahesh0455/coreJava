package MultiThreading;

public class P8 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		T7 t=new T7();
		
		T7.mt=Thread.currentThread();
		
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			
			Thread.sleep(700);
		}
		
		
		
	}

}

class T7 extends Thread{
	
	static Thread mt;
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
			try {
				mt.join();
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			
			System.out.println("Child Thread");
		}
		
		
	}
	
}
