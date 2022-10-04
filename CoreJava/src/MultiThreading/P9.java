package MultiThreading;

public class P9 {
	
	
	public static void main(String args[]) {
		
		SlideRotator sr=new SlideRotator();
		
		sr.start();
		
	}

}


class SlideRotator extends Thread{
	
	public void run() {
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Slide: "+i);
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
	}
}
