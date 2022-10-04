package String;

public class P5 {
	
	
	public static void main(String[] args) {
		
		String s1=new String("durga");
		String s3="durga";
		s1.concat("software");
		String s2=s1.concat("Solutions");
		s1=s1.concat("soft");
		
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		
	}

}
