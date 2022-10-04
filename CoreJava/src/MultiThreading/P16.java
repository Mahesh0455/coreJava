package MultiThreading;

public class P16 {
	
	public static void main(String[] args) {
		
		Display1 d=new Display1();
		T16 t1=new T16(d,"Mahesh");
		t1.start();
		T16 t2=new T16(d,"Rohit");
		t2.start();
		
		
	}

}

class Display1{

	public  void wish(String Name) {
		
		int j=1;
		
		for(int i=0;i<20;i++) {
			System.out.println(Name+i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
		
		synchronized(this){
			for(int i=0;i<10;i++) {
				System.out.print("Hello: ");
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
				
				System.out.println(Name);
				
			}
		}
		
		while(j<5) {
			System.out.println("Post Synch block:"+j);
			j++;
		}
		
		
		
	}
}

class T16 extends Thread{
	Display1 d;
	String name;
	
	T16(Display1 d,String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}


