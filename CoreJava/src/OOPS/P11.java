package OOPS;

public class P11 {

	
	public static void main(String[] args) {
	
		System.out.println(Singleton.getSingleton().hashCode());
		System.out.println(Singleton.getSingleton().hashCode());
		System.out.println(Singleton.getSingleton().hashCode());
		System.out.println(Singleton.getSingleton().hashCode());

		
	}
	
}


class Singleton{
	
	
	
	private static Singleton s=null;
	
	private Singleton() {};
	
	public static Singleton getSingleton() {
		
		if(s==null) {
			s=new Singleton();
		}
		
		return s;
	}
	
	
}

