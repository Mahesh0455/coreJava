package MultiThreading;

public class P4 {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		T3 t =new T3();
		
		T3 t1=new T3();
		
		//t.start();
		t1.start();
		
		t1.setName("Mahesh");
		
		
	}

}

class T3 extends Thread{
	
	
	@Override
	public void run() {
		System.out.println("Child Thread");
		
		System.out.println(Thread.currentThread().getName());
		
	}
}
