package Java.Lang;

public class P2 {

	String name;
	int rollNo;

	P2(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;

	}

	public static void main(String[] args) {

		P2 s1 = new P2("Mahesh", 101);
		P2 s2 = new P2("Pawar", 102);
		P2 s3 = new P2("Mahesh", 101);
		P2 s4 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
