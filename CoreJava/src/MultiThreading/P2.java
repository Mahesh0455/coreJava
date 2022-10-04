package MultiThreading;


class T1 extends Thread{
	
	public void run() {
		
		for(int i=0;i<50;i++) {
			System.out.println("Child Thread");
			try {
				T1.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
	}
}

public class P2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		T1 t=new T1();// Instatiation of thread
		
		t.start();//Starting of thread
		
		for(int j=0;j<50;j++) {
			System.out.println("Main Thread");
			
			Thread.sleep(1000);
		}
		
		
		
	}

}
