package MultiThreading;

public class P18 {
	
	public static void main(String args[] ){
		
		System.out.println(Thread.currentThread().getName()+", "+Thread.currentThread().getPriority());
		
		Thread18 t=new Thread18();
		t.setPriority(10);
		t.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread"+i);
		}
		
	}
	

}


class Thread18 extends Thread{
	
	public void run() {
		for (int i=1;i<=10;i++) {
			System.out.println("Child Thread" +i);
		}
	}
}