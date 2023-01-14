package Enum;

 enum Months{
	Jan,Feb,March
}

public class P3 {
	
	public static void main(String[] args) {
		
		Months m=Months.Feb;
		
		switch(m) {
		
		case Jan:
			System.out.println("January");
			break;
			
		case Feb:
				System.out.println("February");
				break;
		case March:
				System.out.println("March");
				break;
		default:
			System.out.println("other months");
		}
		
	}

}
