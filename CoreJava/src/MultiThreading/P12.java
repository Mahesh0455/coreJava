package MultiThreading;

public class P12 {
	
	
	public static void main(String[] args) {
		
		T12 t=new T12();
		t.start();
		
		t.interrupt();
			
		
	}

}


class T12 extends Thread{
		
	
	public void run() {
		
		for(int i=0;i<20;i++) {
			
			if(i<5) {
				System.out.println("I'm Lazy Thread");
				
				
			}
			else {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {
					System.out.println("I got Interrupted");
				}
			}
			
		}
	}
}
