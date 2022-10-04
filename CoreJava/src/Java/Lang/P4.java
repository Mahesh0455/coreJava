package Java.Lang;

public class P4 {
	
	int rollNo;
	String Name;
	
	P4(int rollNo,String Name){
		this.rollNo=rollNo;
		this.Name=Name;
	
	}
	
	public boolean equals(Object o) {
		P4 p;
		
		try {
			p=(P4)o;
			if(this.rollNo==p.rollNo && this.Name==p.Name) {
				
				return true;
			}
		}
		catch(ClassCastException ce) {
			return false;
		}
		catch(NullPointerException ne) {
			return false;
		}
		
			return false;
	}
	
	
	
	
	public static void main(String[] args) {
		
		P4 p1=new P4(101,"Mahesh");
		P4 p2=new P4(102,"Pawar");
		P4 p3=new P4(101,"Mahesh");
		P4 p4=p1;
		//System.out.println(p1.equals("Mahesh"));
		System.out.println(p1.equals(p3));	
		System.out.println(p1.equals(p4));
		System.out.println(p1.equals(null));
		
		
	}

}
