package Java.Lang;

public class P3 {

	String Name;
	int rollNo;

	P3(String Name, int rollNo) {
		this.Name = Name;
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object o) {
		P3 p = (P3) o;
		if(this.Name==p.Name && this.rollNo==p.rollNo) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		
		P3 s1 = new P3("Mahesh", 101);
		P3 s2 = new P3("Pawar", 102);
		P3 s3 = new P3("Mahesh", 101);
		P3 s4 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
