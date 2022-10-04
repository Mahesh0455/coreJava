package MultiThreading;

public class P15 {
	
	
	public static void main(String[] args) {
		
		ThreadJob d=new ThreadJob();
		
		Thread1 t1=new Thread1(d);
		Thread2 t2=new Thread2(d);
		t1.start();
		t2.start();
		
	}

}

class ThreadJob{
	
	public synchronized void displayNumbers()  {
		
		
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			try {
				Thread.sleep(1500);
			}catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
			
		}
	}
	
	public synchronized void displayChars() {
		for(int i=65;i<=75;i++) {
			System.out.print((char)i);
			
			try {
				Thread.sleep(1500);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
	}
}

class Thread1 extends Thread{
	ThreadJob d;
	
	Thread1(ThreadJob d){
		this.d=d;
	}
	
	public void run()  {
		d.displayNumbers();
	}
	
}

class Thread2 extends Thread{
	ThreadJob d;
	
	Thread2(ThreadJob d){
		this.d=d;
	}
	
	public void run() {
		d.displayChars();
	}
	
	
}
