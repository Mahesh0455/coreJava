package MultiThreading;

public class P7 {
	
	
	public static void main(String[] args) {
		
		T6 t=new T6();
		
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			try {
			Thread.sleep(800);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}


class T6 extends Thread{
	
	public void run() {
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			
			
			
			try {
				Thread.sleep(750);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			
		}
	}
}
