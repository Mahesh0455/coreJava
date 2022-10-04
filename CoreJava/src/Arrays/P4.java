package Arrays;

public class P4 {
	
	public static void main(String[] args) {
		
		
		// Three dimensional arrays
		
		
		int a[][][]=new int [2][][];
		a[0]=new int [3][];
		a[0][0]=new int [2];
		a[0][1]=new int [1];
		a[0][2]=new int [2];
		a[1]=new int [2][];
		a[1][0]=new int [3];
		a[1][1]=new int [4];
		
		System.out.println(a.getClass().getName());
		
	}

}
