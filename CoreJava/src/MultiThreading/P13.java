package MultiThreading;

public class P13 {
	
	public static void main(String[] args) {
		
		Display d=new Display();
		T13 t1=new T13(d,"Mahesh");
		t1.start();
		
		T13 t2=new T13(d,"Virat");
		t2.start();
		
		T13 t3=new T13(d,"Rohit");
		t3.start();
		
	}

}


class Display{
	
	String name;
	
	synchronized public void wish(String name) {
		
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning: ");	
			try {
				Thread.sleep(1500);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.println(name);
		}
	}
	
	
	
}

class T13 extends Thread{
	
	Display d;
	String name;
	
	T13(Display d,String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}
