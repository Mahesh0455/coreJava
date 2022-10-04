package Arrays;

public class P8 {
	
	public static void main(String[] args) {
		
		
		//Array of objects
		
		Object[] o=new Object[3];
		o[0]=new Integer(12);
		o[1]=new Object();
		o[2]=new String();
		
		
		//eg.2
		
		Number[]n=new Number[4];
		n[0]=new Integer(12);
		n[1]=new Float(10.22);
		n[2]=new Byte((byte) 11);
		//n[3]=new String("Hello"); Invalid String cannot be converted to number
	}

}
