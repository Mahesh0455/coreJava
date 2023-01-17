package Development;

public class P3 {
	
	public static void main(String[] args) {
		
		double mb=1024*1024;
		
		Runtime r=Runtime.getRuntime();
		
		System.out.println("Max JVM Memory: "+r.maxMemory()/mb);
		System.out.println("Intial Memory: "+r.totalMemory()/mb);
		System.out.println("Free Memory: "+r.freeMemory()/mb);
		System.out.println("Consumed Memory: "+(r.totalMemory()-r.freeMemory())/mb);
	}

}
