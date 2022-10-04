package Arrays;

public class P9 {
	
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,1};
		int val=0;
		for(int i=0;i<arr.length;i++) {
			val=arr[i];
			arr[val]=i;
		}
		
		for(int a:arr) {
			System.out.print(a+",");
		}
	
	}

}
