package MultiThreading;

public class P5 {
	
	public static void main(String[] args) {
		
		T4 t=new T4();
		
		t.start();
		
		System.out.println("This Line in P5 is executed by Thread: "+ Thread.currentThread().getName());
		
	}

}


class T4 extends Thread{
	
	public void run() {
		System.out.println("This line in T4 is executed by Thread:"+Thread.currentThread().getName());
	}
	
}
