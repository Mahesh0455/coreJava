package DeclarationsAccessModifiers;

public class P9 {
	
	
	final int x;
	
  P9(){
	  x=10;
  }
  
  
  public static void main(String[] args) {
	P9 p=new P9();
	
	System.out.println(p.x);
}

}
