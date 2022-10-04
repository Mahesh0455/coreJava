package Java.Lang;

public class p1 {
	
	int rollno;
	String name;
	
	p1(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
		
	}
	
	public static void main(String[] args) {
		p1 a=new p1(101,"Mahesh");
		p1 b=new p1(102,"Pawar");
		
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println("hashcode: "+a.hashCode());
	}

	@Override
	public String toString() {
		return "p1 [rollno=" + rollno + ", name=" + name + "]";
	}
	
	

}
