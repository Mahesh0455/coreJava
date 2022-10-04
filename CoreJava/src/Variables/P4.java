package Variables;


//static variables

public class P4 {
	
	String name;
	int rollNo;
	static String CName="CDAC-Mumbai";
	
	
	public P4(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public static void main(String[] args) {
		P4 p=new P4("Ashwin",101);
		
		System.out.println(p.name);
		System.out.println(p.rollNo);
		System.out.println(p.CName);
		
		P4 p2=new P4("Mahesh",102);
		System.out.println("************");
		
		System.out.println(p2.name);
		System.out.println(p2.rollNo);
		System.out.println(CName);
		
	}

}
