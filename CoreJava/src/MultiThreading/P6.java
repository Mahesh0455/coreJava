package MultiThreading;

public class P6 {
	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		
		
		
		Thread.currentThread().setPriority(7);
		
		T5 t=new T5();
		System.out.println(t.getPriority());
		
	}

}


class T5 extends Thread{
	
}
