package MultiThreading;

public class P19 {
	
	public static void main(String[] args) {
		
		Thread mt =Thread.currentThread();
		
		Thread19 t=new Thread19(mt);
		t.start();
		
		for(int i=1;i<10;i++) {
			System.out.println("Main Thread"+i);
		}
		
	}

}



class Thread19 extends Thread{
	
	static Thread mt;
	
	Thread19(Thread mt){
		this.mt=mt;
	}
	
	
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<10;i++) {
			System.out.println("Child Thread"+i);
		}
	}
	
}
