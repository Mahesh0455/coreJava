package MultiThreading;

public class P11 {
	
	
	public static void main(String[] args) {
		T11 t=new T11();
		t.start();
		t.interrupt();
		
		System.out.println("End Of main Method");
		
	}

}


class T11 extends Thread{
	
	
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println("I'm Lazy Thread");
			Thread.sleep(2000);
		}
		}catch(InterruptedException ie) {
			System.out.println("I got interrupted");
		}
	}
}
